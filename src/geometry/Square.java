package geometry;

public class Square extends Rectangle implements Colorable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public  void howToColor(){
        System.out.println("Color all four sides");
    }
}
