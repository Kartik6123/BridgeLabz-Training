public class Rotation {

    public static int findRotationIndex(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // minimum is in right half
                left = mid + 1;
            } else {
                // minimum is in left half (including mid)
                right = mid;
            }
        }

        return left; // index of smallest element
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int index = findRotationIndex(arr);
        System.out.println("Rotation Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }
}