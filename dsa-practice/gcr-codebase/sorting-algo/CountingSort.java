public class CountingSort {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // store frequency
        for (int age : ages) {
            count[age - minAge]++;
        }

        // cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // build output array (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // copy back
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 12, 18, 11};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}