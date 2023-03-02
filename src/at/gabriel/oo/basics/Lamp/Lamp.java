package at.gabriel.oo.basics.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Element> elements;

    public Lamp() {
        elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }


    public void turnAllOn() {
        for (Element element : this.elements) {
            element.turnOn();
        }


    }

    public double getOverallPowerUsage() {
        double powerUsage = 0;
        for (Element element : this.elements) {
            element.getPowerConsumption();
            powerUsage = element.getPowerConsumption() / 3;
        }
        return powerUsage;
    }

    public String printNameOfLightElements() {
        String names = "";
        for (Element element : this.elements) {
            element.getColor();
            names += element.getColor();
        }
        return names;
    }
}
