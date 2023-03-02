package ro.sda.fundamentals._6_classes.part_6;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(23, 34);
        Point p2 = new Point(12, 33);
        Point p3 = new Point(10, 20);

        DecimalFormat df = new DecimalFormat("#.###");


        System.out.println("Distance (0,0) = " + df.format(p1.distance()));
        System.out.println("Distance (7,10) = " + df.format(p1.distance(7, 10)));

        System.out.println("-----------------------");

        System.out.println("Distance (p2) is " + p1.distance(p2));
        System.out.println("Distance betwen p3 and another is  " + p3.distance(new Point(100, 200)));

        Point p4 = new Point();
        System.out.println("p4.x is " + p4.getX());
        System.out.println("p4.y is " + p4.getY());

    }
}
