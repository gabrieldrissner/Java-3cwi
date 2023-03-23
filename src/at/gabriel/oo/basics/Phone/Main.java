package at.gabriel.oo.basics.Phone;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1234);
        sim.addNumber(new PhoneNumber("Gabriel","1234"));
        sim.addNumber(new PhoneNumber("Hans", "823"));

        sim.printNumbers();
    }
}
