package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
    Input userRadius = new Input();
    Circle circle = new Circle(userRadius.getDouble("Give me the radius of a circle:"));
        System.out.println("The area of this circle is " +  circle.getArea());
        System.out.println("The circumference for this circle is " +  circle.getCircumference());
    }
}
