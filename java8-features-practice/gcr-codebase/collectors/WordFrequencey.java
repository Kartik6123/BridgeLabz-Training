import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {

        String s = "java is easy java is powerful";

        Map<String, Integer> m =
            Arrays.stream(s.split(" "))
                .collect(Collectors.toMap(
                    w -> w,
                    w -> 1,
                    Integer::sum
                ));

        System.out.println(m);
    }
}
