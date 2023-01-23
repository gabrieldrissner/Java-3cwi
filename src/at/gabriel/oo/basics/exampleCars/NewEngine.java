package at.gabriel.oo.basics.exampleCars;

import at.gabriel.oo.basics.basicCar.Engine;

public class NewEngine {
    public enum TYPE {DIESEL, GAS}


    private Engine.TYPE type; //Diesel oder Benzin

    public NewEngine(Engine.TYPE type) {
        this.type = type;
    }

    public Engine.TYPE getType() {
        return type;
    }


}

