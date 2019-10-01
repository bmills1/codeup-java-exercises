package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    abstract void setWidth(double width);

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }


//    Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//
//    IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
//
//    Change your existing Square class to extend Quadrilateral.
//
//    Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
}
