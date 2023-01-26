package at.gabriel.oo.basics.exampleCars;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    private int ps;

    private at.gabriel.oo.basics.basicCar.Engine.TYPE type; //Diesel oder Benzin

    public Engine(int ps, at.gabriel.oo.basics.basicCar.Engine.TYPE type) {
        this.ps = ps;
        this.type = type;
    }


    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setType(at.gabriel.oo.basics.basicCar.Engine.TYPE type) {
        this.type = type;
    }

    public at.gabriel.oo.basics.basicCar.Engine.TYPE getType() {
        return type;
    }


}

