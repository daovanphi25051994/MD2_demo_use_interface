package geometry;

public class Circle {
    private double radius = 1;
    private String color = "black";
    private boolean filled = true;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "a circle: radius = " + this.radius + " ; color = " + this.color + " ; filled = " + this.filled;
    }
}
