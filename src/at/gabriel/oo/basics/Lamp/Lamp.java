package at.gabriel.oo.basics.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Element> elements;

    public Lamp() {
        elements = new ArrayList<>();
    }
    public  void addElement(Element element){
        elements.add(element);
    }
}
