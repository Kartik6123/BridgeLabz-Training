import java.util.*;

class ProductSort {

    static void quickSort(int[] a, int l, int h) {
        // Quick Sort
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    static int partition(int[] a, int l, int h) {
        // Partitioning for Quick Sort  
        int pivot = a[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[h];
        a[h] = t;

        return i + 1; 
        // pivot position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        for (int x : prices) {
            System.out.print(x + " ");
        }
    }
}
