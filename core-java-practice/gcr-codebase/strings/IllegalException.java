import java.util.Scanner;
public class IllegalException {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        generateException(str);
        // this will cause IllegalArugumentException
        handleException(str); 
        // this will handle the exception safely
    }
    public static void generateException(String s) {
        int startIdx=s.length()-1;
        int endIdx=0;
        String subStr=s.substring(startIdx,endIdx);
        // this will cause IllegalArugumentException
        System.out.println("Substring: "+subStr);
    }
    public static void handleException(String s) {
        try {
            int startIdx=s.length()-1;
            int endIdx=0;
            String subStr=s.substring(startIdx,endIdx);
            System.out.println("Substring: "+subStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Start index cannot be greater than end index. Please provide valid indices."+e.getMessage());
            //handle exception
        }
    }

}
