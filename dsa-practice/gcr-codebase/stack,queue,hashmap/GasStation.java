import java.util.Queue;
import java.util.LinkedList;

class GasStation {

    static int findStart(int[] petrol, int[] dist) {
        int n = petrol.length;
        Queue<Integer> q = new LinkedList<>();
        int surplus = 0;

        for (int i = 0; i < n; i++) {
            int gain = petrol[i] - dist[i];
            surplus += gain;
            q.offer(i);

            // If surplus becomes negative, reset
            while (surplus < 0 && !q.isEmpty()) {
                int idx = q.poll();
                surplus -= (petrol[idx] - dist[idx]);
            }
        }

        return q.size() == n ? q.peek() : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] dist = {6, 5, 3, 5};

        System.out.println(findStart(petrol, dist));
    }
}

