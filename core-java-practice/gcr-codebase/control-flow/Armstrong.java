import java.util.*;
public class Armstrong {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number=sc.nextInt();
    int originalNumber=number;
    //storing original number to compare later
    int sum=0;
    while(number>0){
        //extracting each digit
        int digit=number%10;
        //calculating cube and adding to sum
        sum+=digit*digit*digit;
        //removing last digit
        number/=10;
    }
    if(sum==originalNumber){
        System.out.println(originalNumber+" is an Armstrong number");
    }
    else{
        System.out.println(originalNumber+" is not an Armstrong number");
    }
}    
}
