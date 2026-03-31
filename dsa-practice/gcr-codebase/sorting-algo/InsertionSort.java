public class InsertionSort {
    public static void main(String[] args) {
        int[] empIds = {105, 101, 110, 103, 102};
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;

            // shift elements greater than key to the right
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}