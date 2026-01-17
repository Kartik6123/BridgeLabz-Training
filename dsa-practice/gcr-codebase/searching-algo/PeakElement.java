public class PeakElement {

    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // compare mid with next element
            if (arr[mid] < arr[mid + 1]) {
                // peak is on the right side
                left = mid + 1;
            } else {
                // peak is on the left side (or mid itself)
                right = mid;
            }
        }

        return left; // index of a peak element
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 5, 6, 4};

        int index = findPeakElement(arr);
        System.out.println("Peak Index: " + index);
        System.out.println("Peak Value: " + arr[index]);
    }
}
