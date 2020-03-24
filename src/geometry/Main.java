package geometry;
import java.lang.Comparable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(5.5);
        circles[2] = new ComparableCircle(5.5, "blue", false);
        circles[3] = new ComparableCircle(6.6, "white", true);
        System.out.println("pre-sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
       // Arrays.sort(circles); error
        System.out.println("After-sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
