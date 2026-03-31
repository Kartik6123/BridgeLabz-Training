import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        // Step 1: lowercase
        text = text.toLowerCase();

        // Step 2: remove punctuation
        text = text.replaceAll("[^a-z ]", "");

        // Step 3: split into words
        String[] words = text.split("\\s+");

        // Step 4: count frequency
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
