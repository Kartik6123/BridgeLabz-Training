public class AreaOfCircle {
    int radius;
    AreaOfCircle(int radius){
        this.radius = radius;
        //constructor to initialize radius
    }
    double calculateArea(){
        //method to calculate area
        return Math.PI * radius * radius;
    }
    double calculateCircumference(){
        //method to calculate circumference
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle(5);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
