 import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
          sb.append(sc.next()); 
          //user input 
          sb.reverse();
          //reversed a string
          System.out.println("Reversed String"+ sb.toString());
    }
}
