package at.gabriel.oo.basics.Lamp;

public class Elements {
        private String name;
        private String color;
        private double powerConsumption;
        public enum TYPE {ON, OFF}

    private Elements.TYPE type; //On or OFF

    public Elements(String name, String color, double powerConsumption, TYPE type) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.type = type;
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

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}

