package at.gabriel.oo.basics.Figures;

public class Square extends Figure {
    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getArea() {
        double area = this.a * this.a;
        return area;
    }
}
