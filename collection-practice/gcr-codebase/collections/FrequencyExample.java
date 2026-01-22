import java.util.*;

public class FrequencyExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
        "apple", "banana", "apple", "orange"
        );

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(
                item,
                frequencyMap.getOrDefault(item, 0) + 1
            );
        }

        System.out.println(frequencyMap);
    }
}
