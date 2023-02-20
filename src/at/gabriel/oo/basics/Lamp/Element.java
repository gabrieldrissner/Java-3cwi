package at.gabriel.oo.basics.Lamp;

public class Element {
    private String name;
    private String color;
    private double powerConsumption;

    private boolean state = false;


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Element(String name, String color, double powerConsumption, boolean state) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

}

