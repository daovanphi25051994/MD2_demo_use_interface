package geometry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(0.5);
        circles[2] = new Circle(4, "blue", false);
        System.out.println("pre-sort : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles, new ComparableCircleByRadius());
        System.out.println("after-sort : ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(210, 2);
        rectangles[2] = new Rectangle("blue", false, 2, 4);
        System.out.println("pre-sort : ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Arrays.sort(rectangles, new ComparableRectangleByArea());
        System.out.println("after-sort : ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
