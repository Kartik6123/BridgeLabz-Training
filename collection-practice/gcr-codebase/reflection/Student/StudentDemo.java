package Student;

import java.lang.reflect.*;

public class StudentDemo {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Student");

        Object obj = c.getDeclaredConstructor().newInstance();

        System.out.println(obj.getClass().getName());
    }
}

