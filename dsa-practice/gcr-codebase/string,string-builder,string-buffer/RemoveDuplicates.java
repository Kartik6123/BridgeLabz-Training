import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        sb.append(sc.next());
        for (int i = 0; i < sb.length(); i++) {
        for (int j = i + 1; j < sb.length(); j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
            sb.deleteCharAt(j);
            j--;
        }
    }
}
System.out.println("String after removing duplicates: " + sb.toString());
    }
}
