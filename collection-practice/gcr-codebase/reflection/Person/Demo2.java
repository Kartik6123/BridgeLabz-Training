package Person;

import java.lang.reflect.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class<?> c = p.getClass();
        Field f = c.getDeclaredField("age");

        f.setAccessible(true);   
        f.set(p, 25);

        int val = (int) f.get(p);
        System.out.println("Age = " + val);
    }
}
