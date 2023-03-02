package at.gabriel.oo.basics.Lamp;

public class Element {
    private boolean isOn = false;
    private String color;
    private double powerConsumption;

    public Element(String color, double powerConsumption) {
        this.color = color;
        this.powerConsumption = powerConsumption;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Already on");
        } else {
            isOn = true;
        }
    }


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
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

