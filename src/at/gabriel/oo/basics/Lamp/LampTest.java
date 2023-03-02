package at.gabriel.oo.basics.Lamp;

public class LampTest {
    public static void main(String[] args) {

        Element e1 = new Element("red",20);
        Element e2 = new Element("green",20);
        Element e3 = new Element("red",20);

        Lamp lamp = new Lamp();
        lamp.addElement(e1);
        lamp.addElement(e2);
        lamp.addElement(e3);

        lamp.turnAllOn();

        System.out.println(lamp.getOverallPowerUsage());
        System.out.println(lamp.printNameOfLightElements());

    }
}

