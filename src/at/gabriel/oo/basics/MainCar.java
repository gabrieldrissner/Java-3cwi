package at.gabriel.oo.basics;

import at.gabriel.oo.basics.vehicles.Car;
import at.gabriel.oo.basics.vehicles.Engine;

public class MainCar {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);

        Car car1 = new Car (e1,"DM3423","green",20,500,1);


        System.out.println(car1.getTank() + " Liter");
        car1.drive();
        System.out.println(car1.getTank() + " Liter");

        car1.doBreak();
        car1.turboBoost();
        car1.honk();
        car1.getRemainingRange();
    }


}
