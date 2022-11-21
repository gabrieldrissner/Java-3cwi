package at.gabriel.oo.basics;

import at.gabriel.oo.basics.vehicles.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.colour = "green";
        car1.serialNumber = "DM9835";
        car1.fueldConsumption = 7;
        car1.fuelAmount = 20;

        System.out.println(car1.fuelAmount);
        car1.drive();
        System.out.println(car1.fuelAmount);

        car1.doBreak();
    }
}
