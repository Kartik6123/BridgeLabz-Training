public class ExceptionPropogation {
    public static void main(String[] args) {
        try{
            ExceptionPropogation obj = new ExceptionPropogation();
            System.out.println("Result: " + obj.method2(10, 2));
            System.out.println("Result: " + obj.method2(10, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
    int method2(int a,int b){
        return method1(a,b);
    }
    int method1(int a,int b){
      if(b==0){
          throw new ArithmeticException("Division by zero is not allowed");
      } else {
          return a / b;
      }
    }
}
