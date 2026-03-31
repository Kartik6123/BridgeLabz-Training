public class BankingSystem {
    
}
import java.util.*;

class BankSystem {
    Map<Integer, Integer> acc = new HashMap<>();
    Queue<Integer> q = new LinkedList<>();

    void add(int a, int b) {
        acc.put(a, b);
    }

    void withdraw(int a) {
        q.add(a);
    }

    void process() {
        while (!q.isEmpty()) {
            int a = q.remove();
            if (acc.get(a) >= 100)
                acc.put(a, acc.get(a) - 100);
        }
    }

    void sortedByBalance() {
        TreeMap<Integer, List<Integer>> t = new TreeMap<>();
        for (int k : acc.keySet())
            t.computeIfAbsent(acc.get(k), x -> new ArrayList<>()).add(k);
        System.out.println(t);
    }
}
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem b = new BankSystem();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            b.add(sc.nextInt(), sc.nextInt());

        int k = sc.nextInt();
        for (int i = 0; i < k; i++)
            b.withdraw(sc.nextInt());

        b.process();
        System.out.println(b.acc);
        b.sortedByBalance();
    }
}
