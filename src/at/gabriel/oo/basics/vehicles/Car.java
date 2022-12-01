package at.gabriel.oo.basics.vehicles;

import javax.swing.*;

public class Car {
    private String serialNumber;
    private String colour;
    private int fueldConsumption;
    private int tank;

    private int speed;

    public Car(String serialnumber,
               String colour,
               int fueldConsumption,
               int tank,
               int speed) {
        this.serialNumber = serialNumber;
        this.colour = colour;
        this.fueldConsumption = fueldConsumption;
        this.setTank(tank);
        this.speed = speed;
    }

    public void drive() {
        this.speed = 100;
        this.tank = this.tank - fueldConsumption;
        System.out.println(speed + "km/h");
        System.out.println("I am driving");

    }

    public void doBreak() {
        this.speed = 0;
        System.out.println(speed + "km/h");
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        int valueOfFuel = tank - fueldConsumption;
        int valueOfTenProzent = tank / 100 * 10;
        if (valueOfFuel > valueOfTenProzent) {
            System.out.println("SupperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");

        }

    }

    public void honk() {
        int amountOfRepetitions = 2;
        System.out.println(amountOfRepetitions + " * " + " Tuuut");
    }

    public void getRemainingRange(){
        int residualTank = tank - fueldConsumption;
        int range = residualTank * 5;
        System.out.println("Das Auto kann noch " + range + " km fahren.");
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFueldConsumption(int fueldConsumption) {
        this.fueldConsumption = fueldConsumption;
    }

    public void setTank(int fuelAmount) {
        this.tank = fuelAmount;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColour() {
        return colour;
    }

    public int getFueldConsumption() {
        return fueldConsumption;
    }

    public int getTank() {
        if (tank > 100) {
            tank = 100;
        } else {

        }
        return tank;
    }

    public int getSpeed() {
        return speed;
    }

}

