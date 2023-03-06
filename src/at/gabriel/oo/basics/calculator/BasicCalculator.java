package at.gabriel.oo.basics.calculator;

public class BasicCalculator {
    private double a;
    private double b;

    public BasicCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSum() {
        double sum = this.a + this.b;
        return sum;
    }

    public double getSubtraction() {
        double subtraction = this.a - this.b;
        return subtraction;
    }

    public double getDivision() {
        double division = this.a / this.b;
        return division;
    }

    public double getMultiplication() {
        double multiplication = this.a * this.b;
        return multiplication;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

