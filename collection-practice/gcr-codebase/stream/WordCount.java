import java.io.*;
import java.util.*;

class WordCountTop{
    public static void main(String[] args) {
        BufferedReader br = null;
        HashMap<String, Integer> map = new HashMap<>();

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String w : words) {
                    if (w.length() == 0) continue;
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }

            List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(
                    list.get(i).getKey() + " : " + list.get(i).getValue()
                );
            }

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            if (br != null) br.close();
        }
    }
}
