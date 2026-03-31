import java.util.*;

public class SupressedWariningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // raw type
        list.add("Hello");
        list.add(10);

        String s = (String) list.get(0);
        System.out.println(s);
    }
}
