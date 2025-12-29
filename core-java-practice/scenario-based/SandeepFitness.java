import java.util.Scanner;

public class SandeepFitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum=0;
        int noOfPushUps[] = new int[7];
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter number of push-ups done on day " + day + ": ");
            noOfPushUps[day - 1] = sc.nextInt();
            sum += noOfPushUps[day - 1];
        }
        for(int i=0;i<noOfPushUps.length;i++){
           if(noOfPushUps[i]==0){
               continue;
               // skip days with zero push-ups
           }
           count++;
        }
        double average = sum / count;
        System.out.println("Average push-ups per day: " + average);
    }
}
