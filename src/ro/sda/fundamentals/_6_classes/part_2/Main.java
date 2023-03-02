package ro.sda.fundamentals._6_classes.part_2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(100.73);
        calc.setSecondNumber(50.23);

        SimpleCalculator anotherCalc= new SimpleCalculator();
        anotherCalc.setFirstNumber(56.73);
        anotherCalc.setSecondNumber(0.0);

        DecimalFormat df =  new DecimalFormat("#.###");

        System.out.println("Addition result is " + calc.getAdditionResult());
        System.out.println("Substraction result is " + df.format(calc.getSubtractionResult()));
        System.out.println("Multiplication result is " + df.format(calc.getMultiplicationResult()));

        System.out.println("-------------------cu functia format----------------");
        System.out.format("Divison result is %.3f \n" , calc.getDivisionResult());

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Addition result is " + anotherCalc.getAdditionResult());
        System.out.println("Substraction result is " + anotherCalc.getSubtractionResult());
        System.out.println("Multiplication result is " + anotherCalc.getMultiplicationResult());
        System.out.println("Divison result is " + anotherCalc.getDivisionResult());

        System.out.println("--------------------------------------------------");

        SimpleCalculator calc2 = new SimpleCalculator(29.23, 12.67);
        System.out.println("Addition result is " + calc2.getAdditionResult());
        System.out.println("Substraction result is " + calc2.getSubtractionResult());


    }
}
