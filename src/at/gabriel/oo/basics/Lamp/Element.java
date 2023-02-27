package at.gabriel.oo.basics.Lamp;

public class Element {
    private String color;
    private double powerConsumption;

    private boolean isOn = false;


    public boolean isOn() {
        return isOn;
    }

    public void setState(boolean isOn) {
        this.isOn = isOn;
    }

    public Element(String color, double powerConsumption, boolean isOn) {
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
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

    public void setOn(boolean on) {
        isOn = on;
    }
}

