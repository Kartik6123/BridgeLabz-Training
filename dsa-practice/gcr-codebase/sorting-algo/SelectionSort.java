public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {72, 88, 65, 90, 78};
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find minimum element
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}