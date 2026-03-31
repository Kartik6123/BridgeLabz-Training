import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount=scanner.nextInt();
         try{
            try{
                if(amount>10000){
                    throw new IllegalArgumentException("Amount exceeds deposit limit of 10000");
                } else {
                    System.out.println("Deposited: " + amount);
                }
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            if(amount<0){
                throw new IllegalArgumentException("Amount cannot be negative");
            } else {
                System.out.println("Deposited: " + amount);
            }
         }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
    }
}
}
