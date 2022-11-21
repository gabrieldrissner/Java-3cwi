package at.gabriel.oo.basics.vehicles;

import javax.swing.*;

public class Car {
    public String serialNumber;
    public String colour;
    public int fueldConsumption;
    public int fuelAmount;

    public int speed;


    public void drive() {
        this.speed = 100;
        this.fuelAmount = this.fuelAmount - fueldConsumption;
        System.out.println(speed + "km/h");
        System.out.println("I am driving");

    }

    public void doBreak() {
        this.speed = 0;
        System.out.println(speed + "km/h");
        System.out.println("I am braeking");
    }

    public void turboBoost() {
        int valueOfFuel = fueldConsumption / fuelAmount * 100;
        int valueOfTenProzent = fuelAmount / 100 * 10;
        if (valueOfFuel > valueOfTenProzent) {
            System.out.println("SupperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");

        }
    }
}

