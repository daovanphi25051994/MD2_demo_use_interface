package geometry;


public class Main {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle();
        geometries[1] = new Rectangle();
        geometries[2] = new Square();
        for (Geometry geometry : geometries) {
            double randomNumber = Math.ceil(Math.random() * 100);
            geometry.resize(randomNumber);
        }
        for (Geometry geometry : geometries) {
            System.out.println(geometry);
        }
    }
}