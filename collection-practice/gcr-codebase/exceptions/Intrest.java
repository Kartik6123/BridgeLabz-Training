
public class Intrest {
    public static void main(String[] args) {
        try {
            Intrest obj = new Intrest();
            obj.simpleIntrest(1000, 5, 3);
            obj.simpleIntrest(-500, 4, 2); // This will throw an exception
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
    public void simpleIntrest(double p, double r, double t) throws IllegalAccessException{
        if(p < 0 || r < 0 || t < 0){
            throw new IllegalAccessException("Values must be non-negative");
        }
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
