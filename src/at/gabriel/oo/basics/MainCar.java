package at.gabriel.oo.basics;

import at.gabriel.oo.basics.vehicles.Car;

public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car ("DM3423","green",15,500,100);


        System.out.println(car1.getTank() + " Liter");
        car1.drive();
        System.out.println(car1.getTank() + " Liter");

        car1.doBreak();
        car1.turboBoost();
        car1.honk();
        car1.getRemainingRange();
    }


}
