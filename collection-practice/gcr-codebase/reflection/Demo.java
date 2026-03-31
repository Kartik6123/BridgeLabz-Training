import java.lang.reflect.*;
public class Demo {
    public static void main(String[] args) throws Exception {

        String className = "java.util.ArrayList"; // input
        Class<?> c = Class.forName(className);

        System.out.println("Class Name: " + c.getName());

        System.out.println("\nMethods:");
        Method[] m = c.getDeclaredMethods();
        for (Method x : m) {
            System.out.println(x.getName());
        }

        System.out.println("\nFields:");
        Field[] f = c.getDeclaredFields();
        for (Field x : f) {
            System.out.println(x.getName());
        }

        System.out.println("\nConstructors:");
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor<?> x : cons) {
            System.out.println(x);
        }
    }
}
