import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // Sort the list
        Collections.sort(list);

        System.out.println(list);
    }
}
