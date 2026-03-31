package classandobject;
public class PalindromeChecker {
    String text;
    PalindromeChecker(String text){
        this.text = text;
    }
    boolean isPalindrome(){
        String temp=text;
        String reversed="";
        for(int i=temp.length()-1;i>=0;i--){
            reversed=reversed+temp.charAt(i);
        }
        if(text.equalsIgnoreCase(reversed)){
            return true;
    }
    else{
        return false;
    }
}
    void display(){
        if(isPalindrome()){
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Madam");
         checker.display();
    }
}
