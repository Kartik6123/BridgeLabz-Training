import java.lang.reflect.*;

class TimingUtil {

    public static Object invokeTimed(Object obj, String methodName) throws Exception {

        Method m = obj.getClass().getDeclaredMethod(methodName);
        m.setAccessible(true);

        long start = System.nanoTime();
        Object res = m.invoke(obj);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
        return res;
    }
}
