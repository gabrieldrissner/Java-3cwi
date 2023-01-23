package at.gabriel.oo.basics;

import at.gabriel.oo.basics.basicCar.Car;
import at.gabriel.oo.basics.basicCar.Engine;
import at.gabriel.oo.basics.basicCar.RearMirror;
import at.gabriel.oo.basics.basicCar.tyre;

public class MainCar {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);

        Car car1 = new Car(e1, "DM3423", "green", 20, 500, 1);


        System.out.println(car1.getTank() + " Liter");
        car1.drive();
        System.out.println(car1.getTank() + " Liter");

        car1.doBreak();
        car1.turboBoost();
        car1.honk();
        car1.getRemainingRange();

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        car1.addMirror(r1);
        car1.addMirror(r2);
        System.out.println("Position Spiegel 1: " + car1.getMirrors().get(0).getPosition());


        tyre t1 = new tyre(100, tyre.TYPE.Winterreifen);
        tyre t2 = new tyre(100, tyre.TYPE.Sommerreifen);
        tyre t3 = new tyre(100, tyre.TYPE.Winterreifen);
        tyre t4 = new tyre(100, tyre.TYPE.Winterreifen);

        car1.addTyre(t1);
        car1.addTyre(t2);
        car1.addTyre(t3);
        car1.addTyre(t4);

        System.out.println("Die Reifen: haben die Größe " + car1.getTire().get(0).getSize());
    }


}
