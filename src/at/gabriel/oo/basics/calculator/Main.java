package at.gabriel.oo.basics.calculator;

public class Main {
    public static void main(String[] args) {


        BasicCalculator calculator1 = new BasicCalculator(12, 4);
        RootCalculator rootCalculator1 = new RootCalculator(9, 5);
        TrigonometricCalculator trigonometricCalculator1 = new TrigonometricCalculator(90,50);

        System.out.println(calculator1.getSum());
        System.out.println(calculator1.getSubtraction());
        System.out.println(calculator1.getMultiplication());
        System.out.println(calculator1.getDivision());
        System.out.println("Wurzel " + rootCalculator1.SquareRoot());
        System.out.println("Sinus " + trigonometricCalculator1.Sinus());
        System.out.println("Cosinus " + trigonometricCalculator1.Cosinus());
    }

}