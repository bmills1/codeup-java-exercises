package shapes;

public class ShapesTest {
    public static void main(String[] args) {

//
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println((int)box1.getPerimeter());
//        System.out.println((int)box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println((int)box2.getPerimeter());
//        System.out.println((int)box2.getArea());
        Measurable myShape = new Square(5);
        System.out.println("\nThe area of shape 1 is " +(int)myShape.getArea());
        System.out.println("The perimeter of shape 1 is "+ (int)myShape.getPerimeter());
        Measurable myShape2 = new Rectangle(5, 2);
        System.out.println("\nThe area of shape 2 is " + (int)myShape2.getArea());
        System.out.println("The perimeter of shape 2 is " + (int)myShape2.getPerimeter());
    }
}