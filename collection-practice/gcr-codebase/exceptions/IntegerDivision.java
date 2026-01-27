public class IntegerDivision {
    public static void main(String[] args) {
        try{
            IntegerDivision obj = new IntegerDivision();
            System.out.println("Result: " + obj.divide(10, 2));
            System.out.println("Result: " + obj.divide(10, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
    public int divide(int a,int b) {
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        } else {
            return a / b;
        }
    }
}
