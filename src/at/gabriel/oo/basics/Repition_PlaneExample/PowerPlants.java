package at.gabriel.oo.basics.Repition_PlaneExample;

public class PowerPlants {
    private int horsepower;
    private int powerPlantsQuantity;
    private String position;

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getPowerPlantsQuantity() {
        return powerPlantsQuantity;
    }

    public void setPowerPlantsQuantity(int powerPlantsQuantity) {
        this.powerPlantsQuantity = powerPlantsQuantity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public PowerPlants(int horsepower, int powerPlantsQuantity, String position) {
        this.horsepower = horsepower;
        this.powerPlantsQuantity = powerPlantsQuantity;
        this.position = position;
    }
    public String start(){
        String start = "I am starting";

        return start;
    }

    public String stop(){
        String stop = "I am stopping";

        return stop;
    }
}
