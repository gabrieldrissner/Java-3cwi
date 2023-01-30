package at.gabriel.oo.basics.exampleCars;

public class Car2Test {
    public static void main(String[] args) {

        Producer producer1 = new Producer("Porsche", "Italien", 15);

        Car car1 = new Car("green", 600, 10000, 50, producer1,0);

        Engine engine1 = new Engine(1600, at.gabriel.oo.basics.basicCar.Engine.TYPE.GAS);


        System.out.println(producer1.getRabatt() + "%");
        System.out.println(car1.carPrice() + "€");
        System.out.println(car1.carConsumption() + " Benzinverbrauch pro km");
        System.out.println(car1.drive());
        System.out.println(car1.drive());
        System.out.println(car1.drive());
        System.out.println(car1.carConsumption() + " Benzinverbrauch pro km");
    }
}