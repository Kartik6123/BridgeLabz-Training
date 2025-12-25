import java.util.Scanner;
class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (result.indexOf(ch) == -1) {
                //indexOf returns -1 if character not found in result
                // Check if character is not already in result
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}