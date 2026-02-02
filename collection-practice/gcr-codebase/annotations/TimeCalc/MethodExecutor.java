import java.lang.reflect.Method;

public class MethodExecutor {

    public static void execute(Object obj) throws Exception {

        Class<?> c = obj.getClass();
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {

            if (m.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                m.invoke(obj);
                long end = System.nanoTime();

                System.out.println(
                    m.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
