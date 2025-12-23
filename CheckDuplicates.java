import java.util.Scanner;
public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                 if(a[i]==a[j]) {
                     System.out.println("Duplicate element found: " + a[i]);
                 }
            }
        }
    }
}
