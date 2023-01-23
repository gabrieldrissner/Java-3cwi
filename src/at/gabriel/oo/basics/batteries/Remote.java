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

    public double turnOn() {
        double batteryPack1 = this.battery1.getState() * 0.95;
        double batteryPack2 = this.battery2.getState() * 0.95;
       return batteryPack1;
    }
}
