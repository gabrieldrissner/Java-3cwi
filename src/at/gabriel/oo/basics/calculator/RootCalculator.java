package at.gabriel.oo.basics.calculator;

public class RootCalculator extends BasicCalculator {


    public RootCalculator(double a, double b) {
        super(a, b);
    }


    public double SquareRoot() {

        double squareRoot = Math.sqrt(getA());
        return squareRoot;
    }
}



