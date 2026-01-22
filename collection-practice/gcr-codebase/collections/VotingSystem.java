import java.util.*;

class VotingSystem {
    Map<String, Integer> votes = new HashMap<>();
    Map<String, Integer> order = new LinkedHashMap<>();

    void vote(String c) {
        votes.put(c, votes.getOrDefault(c, 0) + 1);
        order.put(c, order.getOrDefault(c, 0) + 1);
    }

    void showOrder() {
        System.out.println(order);
    }

    void showSorted() {
        TreeMap<String, Integer> t = new TreeMap<>(votes);
        System.out.println(t);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingSystem v = new VotingSystem();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            v.vote(sc.next());

        v.showOrder();
        v.showSorted();
    }
}
