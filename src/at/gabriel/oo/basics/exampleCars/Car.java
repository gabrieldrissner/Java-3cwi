package at.gabriel.oo.basics.exampleCars;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Car {
    private String color;
    private double maxSpeed;
    private double price;
    private double fuelConsumption;
    private Producer producer;

    public Car(String color, double maxSpeed, double price, double fuelConsumption, Producer producer) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.producer = producer;
    }

    public double carPrice() {
        this.producer.getRabatt();
        double carPrice = this.price - this.price /100 * this.producer.getRabatt();
        return carPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
