import java.util.Scanner;

public class FizzBuzz2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number=sc.nextInt();
    if(number>0){
        while(number>0){
            if(number%3==0 && number%5==0){
                //check divisibility by 3 and 5
                System.out.println("FizzBuzz");
            }
            else if(number%3==0){
                //check divisibility by 3
                System.out.println("Fizz");
            }
            else if(number%5==0){
                //check divisibility by 5
                System.out.println("Buzz");
            }
            else{
                System.out.println(number);
            }
            number--;
        }
    }
    else{
        System.out.println("Please enter a positive integer");
    }
}    
}
