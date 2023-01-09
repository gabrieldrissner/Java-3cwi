package at.gabriel.oo.basics.vehicles;

public class Engine {

    public enum TYPE {DIESEL, GAS}

    private int horsePower;
    private TYPE type; //Diesel oder Benzin

    //amount should be between 0 and 100


    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }


}





