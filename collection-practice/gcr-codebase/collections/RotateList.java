import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int k = 2; // rotate by 2
        int n = list.size();

        k = k % n; // handle large rotation values

        // rotate
        List<Integer> result = new ArrayList<>();
        result.addAll(list.subList(k, n));
        result.addAll(list.subList(0, k));

        System.out.println(result);
    }
}
