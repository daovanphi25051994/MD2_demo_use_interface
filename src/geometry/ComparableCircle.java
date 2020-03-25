package geometry;
import java.util.Comparator;

public class ComparableCircle extends Circle implements Comparator<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare(ComparableCircle com1, ComparableCircle com2) {
        if (com1.getRadius() > com2.getRadius()){
            return 1;
        }else if (com1.getRadius() < com2.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }
}