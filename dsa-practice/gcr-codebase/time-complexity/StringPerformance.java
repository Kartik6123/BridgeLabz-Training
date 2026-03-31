import java.util.*;

public class StringPerformance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        long start, end;

        //   Using String (O(N^2))
        start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + "a";
        }
        end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        //   Using StringBuilder (O(N))
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        //   Using StringBuffer (O(N))
        start = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");

        sc.close();
    }
}