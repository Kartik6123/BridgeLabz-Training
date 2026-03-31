import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Caching {

    // 1️ Annotation
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface CacheResult {
    }

    // 2️ Cache storage
    static Map<String, Object> cache = new HashMap<>();

    // 3️ Expensive service
    static class Calculator {

        @CacheResult
        public int expensiveCalculation(int n) {
            System.out.println("Executing expensive calculation...");
            try {
                Thread.sleep(1000); // simulate heavy work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return n * n;
        }
    }

    // 4️ Method invoker with caching logic
    static Object invokeWithCache(Object obj, String methodName, Object... args) {
        try {
            Class<?> cls = obj.getClass();
            Method method = cls.getDeclaredMethod(methodName, int.class);

            // Create cache key (method + arguments)
            String cacheKey = methodName + "_" + args[0];

            if (method.isAnnotationPresent(CacheResult.class)) {

                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result");
                    return cache.get(cacheKey);
                }

                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            }

            return method.invoke(obj, args);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 5️ Test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(invokeWithCache(calc, "expensiveCalculation", 5));
        System.out.println(invokeWithCache(calc, "expensiveCalculation", 5));
        System.out.println(invokeWithCache(calc, "expensiveCalculation", 6));
    }
}
