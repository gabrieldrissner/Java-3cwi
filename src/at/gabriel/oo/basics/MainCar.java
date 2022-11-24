package at.gabriel.oo.basics;

import at.gabriel.oo.basics.vehicles.Car;

public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car("DM9835", "green", 7,20,100);


        System.out.println(car1.fuelAmount + " Liter");
        car1.drive();
        System.out.println(car1.fuelAmount + " Liter");

        car1.doBreak();
        car1.turboBoost();
    }


}
