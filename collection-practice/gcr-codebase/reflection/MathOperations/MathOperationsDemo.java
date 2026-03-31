package MathOperations;

import java.lang.reflect.*;
import java.util.*;

public class MathOperationsDemo {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String methodName = sc.next(); // add / subtract / multiply
        int x = sc.nextInt();
        int y = sc.nextInt();

        MathOperations obj = new MathOperations();
        Class<?> c = obj.getClass();

        Method m = c.getMethod(methodName, int.class, int.class);

        Object res = m.invoke(obj, x, y);
        System.out.println("Result = " + res);
    }
}

