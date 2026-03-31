package classandobject;
public class Circle {
    int radius;
    Circle(int radius){
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
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
