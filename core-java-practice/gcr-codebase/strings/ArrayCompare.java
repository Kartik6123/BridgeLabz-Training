import java.util.*;
class ArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();
        char[] arr1 = getCharArray(text);
        char[] arr2 = text.toCharArray();
        // Convert string to char array using toCharArray() method
        boolean result = check(arr1, arr2);
        if(result==false){
            // Compare two char arrays
            System.out.println("Both character arrays are different");
        }
        else{
        System.out.println("Both character arrays are same");
    }
    }
    static char[] getCharArray(String s) {
        //method to convert string to char array using charAt()
        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        return a;
    }

    static boolean check(char[] a, char[] b) {
        //method to compare two char arrays
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

