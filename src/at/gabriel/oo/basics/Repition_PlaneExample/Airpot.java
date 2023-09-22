package at.gabriel.oo.basics.Repition_PlaneExample;

import java.util.ArrayList;
import java.util.List;

public class Airpot {

    private int airpotArea;
    private int runways;
    private int airpotCapacity;
    private int employees;
    private int gates;
    private int passenger;
    private List<Hanger> hangers;

    private Hanger hanger;

    public Airpot(int airpotArea, int runways, int airpotCapacity, int employees, int gates, int passenger, Hanger hanger) {
        this.airpotArea = airpotArea;
        this.runways = runways;
        this.airpotCapacity = airpotCapacity;
        this.employees = employees;
        this.gates = gates;
        this.passenger = passenger;
        this.hanger = hanger;
        this.hangers = new ArrayList<Hanger>();
    }

    public List<Hanger> getHangers() {
        return hangers;
    }

    public void addHanger(Hanger hangers) {
        this.hangers.add(hanger);
    }
    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getArea() {
        return airpotArea;
    }

    public void setArea(int area) {
        this.airpotArea = area;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getAirpotCapacity() {
        return airpotCapacity;
    }

    public void setAirpotCapacity(int airpotCapacity) {
        this.airpotCapacity = airpotCapacity;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }

    public boolean checkIn() {
        boolean state = false;
        if (getPassenger() >= 1) {
            state = true;
        }
        return state;
    }

    public boolean passportControll(){
        boolean status = false;

        if(getPassenger() >= 1){
            status = true;
        }

        return status;
    }
}
