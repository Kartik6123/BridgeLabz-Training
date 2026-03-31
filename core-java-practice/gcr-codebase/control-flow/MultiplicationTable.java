import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to print its multiplication table: ");
    int number=sc.nextInt();
    for(int i=6;i<=9;i++) {
        //multiplication table from 6 to 9
        int result=number*i;
        System.out.println(number+" x "+i+" = "+result);
    }
}    
}
