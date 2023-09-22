package at.gabriel.oo.basics.Repition_PlaneExample;

import java.util.List;

public class Airbus_A4320 extends Plane {

    public Airbus_A4320(String planeColor, int planeHeight, int planeWeight, int planeWidth, int speed, int planeCapacity, int seats, Wings wings, PowerPlants powerPlants, Tank tank) {
        super(planeColor, planeHeight, planeWeight, planeWidth, speed, planeCapacity, seats, wings, powerPlants, tank);
    }

    private int windowsHeight;
    private int windowsWidth;

    public Airbus_A4320(String planeColor, int planeHeight, int planeWeight, int planeWidth, int speed, int planeCapacity, int seats, Wings wings, PowerPlants powerPlants, Tank tank, int windowsHeight, int windowsWidth) {
        super(planeColor, planeHeight, planeWeight, planeWidth, speed, planeCapacity, seats, wings, powerPlants, tank);
        this.windowsHeight = windowsHeight;
        this.windowsWidth = windowsWidth;
    }
}