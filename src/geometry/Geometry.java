package geometry;

public abstract class Geometry {
    private String color = "black";
    private boolean filled = true;

    public Geometry() {
    }

    public Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract void resize(double percent);
    @Override
    public String toString() {
        return "color: " + this.color + " ; filled = " + this.filled;
    }
}
