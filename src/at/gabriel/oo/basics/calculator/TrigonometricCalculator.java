package at.gabriel.oo.basics.calculator;

public class TrigonometricCalculator extends BasicCalculator {
    public TrigonometricCalculator(double a, double b) {
        super(a, b);
    }

    public double Sinus() {
        double sinus = Math.sin(getA());
        return sinus;
    }

    public double Cosinus() {
        double cosinus = Math.cos(getA());
        return cosinus;
    }
}
