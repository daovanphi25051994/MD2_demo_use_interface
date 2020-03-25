package geometry;

import java.util.Arrays;

public class Main {
    public static void showResultCompare(int checkCompare, int index1, int index2) {
        if (checkCompare > 0) {
            System.out.printf("circle[%d] > circle[%d]\n", index1, index2);
        } else if ((checkCompare < 0)) {
            System.out.printf("circle[%d] < circle[%d]\n", index1, index2);
        } else {
            System.out.printf("circle[%d] = circle[%d]\n", index1, index2);
        }
    }

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(9.5);
        circles[2] = new ComparableCircle(2.5, "blue", false);
        circles[3] = new ComparableCircle(0.9, "white", true);
        int checkCompare = circles[1].compareTo(circles[2]);
        Main.showResultCompare(checkCompare, 1, 2);
        System.out.println("pre-sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles, new ComparableCircle());
        System.out.println("After-sorted : ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        checkCompare = circles[1].compareTo(circles[2]);
        Main.showResultCompare(checkCompare, 1, 2);

    }
}
