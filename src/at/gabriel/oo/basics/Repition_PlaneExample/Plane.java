package at.gabriel.oo.basics.Repition_PlaneExample;

import at.gabriel.oo.basics.Camera.File;

import java.util.List;

public class Plane {
    private String planeColor;
    private int planeHeight;
    private int planeWeight;
    private int planeWidth;
    private int speed;
    private int planeCapacity;
    private int seats;


    private Wings wings;

    private PowerPlants powerPlants;

    private Tank tank;

    public Plane(String planeColor, int planeHeight, int planeWeight, int planeWidth, int speed, int planeCapacity, int seats, Wings wings, PowerPlants powerPlants, Tank tank) {
        this.planeColor = planeColor;
        this.planeHeight = planeHeight;
        this.planeWeight = planeWeight;
        this.planeWidth = planeWidth;
        this.speed = speed;
        this.planeCapacity = planeCapacity;
        this.seats = seats;
        this.wings = wings;
        this.powerPlants = powerPlants;
        this.tank = tank;
    }


    public String getPlaneColor() {
        return planeColor;
    }

    public void setPlaneColor(String planeColor) {
        this.planeColor = planeColor;
    }

    public int getPlaneHeight() {
        return planeHeight;
    }

    public void setPlaneHeight(int planeHeight) {
        this.planeHeight = planeHeight;
    }

    public int getWeight() {
        return planeWeight;
    }

    public void setWeight(int weight) {
        this.planeWeight = weight;
    }

    public int getPlaneWidth() {
        return planeWidth;
    }

    public void setPlaneWidth(int planeWidth) {
        this.planeWidth = planeWidth;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public void setPlaneCapacity(int planeCapacity) {
        this.planeCapacity = planeCapacity;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String fly() {
        String on = "I am flying";
        return on;
    }

    public String landing() {
        String off = "I am landing";
        return off;
    }
}
