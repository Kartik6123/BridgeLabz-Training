public class FirstNegativeElement {

    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // first negative found
            }
        }
        return -1; // no negative number
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, -7, 8, -1};

        int result = findFirstNegative(arr);
        System.out.println(result);
    }
}