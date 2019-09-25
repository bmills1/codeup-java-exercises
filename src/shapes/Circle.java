package shapes;

public class Circle {
    //    Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle. This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,  2);
    }

    public double getCircumference() {
        return  Math.PI * 2 * this.radius;
    }
//    Inside of shapes, create a class  named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
//
//    The formulas for circumference and area:
//
//
//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)
//    For the value of pi, use the PI constant of the Math class.
}
