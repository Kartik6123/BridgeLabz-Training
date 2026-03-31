public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            if(a.length==5){
                try{
                    System.out.println("Accessing element: " + a[10]);
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Inner Catch: Array index is out of bounds.");
                }
            }
            int a1=5;
            int b=2;
            outerMethod(a1,b);
        }
        catch(Exception e){
            System.out.println("Outer Catch: An arithmatic  exception occurred.");
        }
    }
    static void outerMethod(int a1,int b){ {
         if(b==0){
                throw new ArithmeticException("Division by zero is not allowed");
            } else {
                System.out.println("Result: " + (a1 / b));
         }
    }
}}
