package at.gabriel.oo.basics.Figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    private double pi = Math.PI;

    @Override
    public double getArea() {
        double area = this.radius * pi;
        return area;
    }
}
