package at.gabriel.oo.basics.Figures;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("circle1",30);
        Cube cu1 = new Cube("cube1",5,4);
        Rectangle r1 = new Rectangle("rectangle1",4,10);
        Square s1 = new Square("square1",10);

        System.out.println(c1.getName());
        System.out.println(c1.getArea());
        System.out.println(cu1.getName());
        System.out.println(cu1.getArea());
        System.out.println(r1.getName());
        System.out.println(r1.getArea());
        System.out.println(s1.getName());
        System.out.println(s1.getArea());

    }
}
