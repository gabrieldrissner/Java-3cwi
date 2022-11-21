package at.gabriel.oo.basics.vehicles;

public class Car {
    public String serialNumber;
    public String colour;
    public int fueldConsumption;
    public int fuelAmount;

    public int speed;

    public void drive(){
        this.speed = 100;
        this.fuelAmount = this.fuelAmount - fueldConsumption;
        System.out.println(speed + "km/h");
        System.out.println("I am driving");

    }

    public void doBreak(){
        this.speed = 0;
        System.out.println(speed + "km/h");
        System.out.println("I am braeking");
    }

}
