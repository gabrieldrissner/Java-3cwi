package at.gabriel.oo.basics.batteries;

public class Remote {
    private Battery battery1;
    private Battery battery2;

    private int state;

    public Remote(Battery battery1, Battery battery2) {


        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public double getStatus() {

        double state = (battery1.getState() + battery2.getState()) / 2;
        return state;

    }

    public String turnOn() {
        String on = "Der Verbraucher ist angeschlossen";
        double newStateBattery1 = this.battery1.getState() * 0.95;
        double newStateBattery2 = this.battery2.getState() * 0.95;
        System.out.println("Neuer Akkustand Batterie 1: " + newStateBattery1);
        System.out.println("Neuer Akkustand Batterie 2: " + newStateBattery2);
        return on;
    }

    public String turnOff(){
        String off = "Kein Verbraucher angeschlossen";
        return off;
    }
}
