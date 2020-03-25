package geometry;

public class Rectangle extends Geometry {
    private double length = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int compareTo(Rectangle rectangle) {
        if (this.getArea() > rectangle.getArea()) {
            return 1;
        } else if (this.getArea() < rectangle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public double getPerimeter() {
        return ((this.length + this.width) * 2);
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public String toString() {
        return "a rectangle with length = " + this.length
                + " ; width = " + this.width
                + " ; color = " + super.getColor()
                + " ; filled = " + super.isFilled()
                + "; perimeter = " + this.getPerimeter()
                + " ; area = " + this.getArea();
    }
}
