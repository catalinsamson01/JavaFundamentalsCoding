package ro.sda.fundamentals._6_classes.part_3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wall 1: ");

        Wall wall1 = new Wall();
        wall1.setWidth(-100);
        wall1.setHeight(50);

        System.out.println("Width = " + wall1.getWidth());
        System.out.println("Height = " + wall1.getHeight());
        System.out.println("Area = " + wall1.getArea());

        System.out.println("-----------------------");


        System.out.println("Wall 2: ");
        Wall wall2 = new Wall(75, 95);
        System.out.println("Width = " + wall2.getWidth());
        System.out.println("Height = " + wall2.getHeight());
        System.out.println("Area = " + wall2.getArea());

    }



}
