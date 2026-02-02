package Calculator;

import java.lang.reflect.*;

public class CalculatorDemo {
    public static void main(String[] args) throws Exception {

        Calculator c1 = new Calculator();

        Class<?> c = c1.getClass();
        Method m = c.getDeclaredMethod("multiply", int.class, int.class);

        m.setAccessible(true);

        int res = (int) m.invoke(c1, 3, 4);
        System.out.println("Result = " + res);
    }
}
