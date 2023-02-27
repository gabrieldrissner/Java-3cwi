package at.gabriel.oo.basics.Lamp;

public class LampTest {
    public static void main(String[] args) {

        Element e1 = new Element("green", 50,false);
        Element e2 = new Element("red",40,false);

        System.out.println(e1.getColor());
        Lamp l1 = new Lamp();

        l1.addElement(e1);
        l1.addElement(e2);


    }
}

