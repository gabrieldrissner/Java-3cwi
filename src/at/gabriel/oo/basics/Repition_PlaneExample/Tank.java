package at.gabriel.oo.basics.Repition_PlaneExample;

public class Tank {
    private int tankCapacity;

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Tank(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int tankState(){
        return this.tankCapacity;
    }
}
