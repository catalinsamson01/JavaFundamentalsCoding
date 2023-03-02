package ro.sda.fundamentals._6_classes.part_7;

//1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
//        The class needs to have one constructor with parameters width and height of type double and it needs to initialize the fields.
//        In case the width parameter is less than 0 it needs to set the width field value to 0,
//        in case the length parameter is less than 0 it needs to set the length field value to 0.
//        Write the following methods (instance methods):
//        * Method named getArea without any parameters, it needs to return the calculated area (width * length).
public class Floor {
    private double width;
    private double lenght;

    public Floor() {
//        using the below syntax, we call the constructor with parameters, passing some default arguments
        this(1, 1);

    }

    public Floor(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (lenght < 0) {
            this.lenght = 0;
        } else {
            this.lenght = lenght;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return this.width * this.lenght;
    }
}
