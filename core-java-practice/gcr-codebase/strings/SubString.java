import java.util.*;
class subString{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        // Input start index
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Input end index
        String sub1 = subStr(text, start, end);
        String sub2 = text.substring(start, end);
        // subString using substring() method
        boolean result = check(sub1, sub2);
         if(result==false){
             System.out.println("Both substrings are different");
         }
         else
        System.out.println("Both substrings are same: " + result);
    }
    public static boolean check(String a, String b) {
        //method to compare two strings using charAt()
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static String subStr(String s, int st, int ed) {
        //method to get substring using charAt()
        String res = "";
        for (int i = st; i < ed; i++) {
            res = res + s.charAt(i);
        }
        return res;
    }
}

