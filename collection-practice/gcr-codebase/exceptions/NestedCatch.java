import java.util.Scanner;

public class NestedCatch {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
     int a=sc.nextInt();
     if(a<0){
        throw new NullPointerException("Size>0");
     }
     int arr[]=new int[a];
     for(int i=0;i<=a;i++){
        if(i>=a){
            throw new ArrayIndexOutOfBoundsException("Enter elements within array's size");
        }
        arr[i]=sc.nextInt();
     }
    }
    catch( NullPointerException e){
     System.out.println(e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
 }   
}
