package at.gabriel.oo.basics.Repition_PlaneExample;

import java.util.ArrayList;
import java.util.List;

public class Hanger {
    private int hangerQuantity;
    private int hangerArea;
    private int hangerLength;
    private int hangerWidth;

    private List<Plane> planes;

    public int getHangerQuantity() {
        return hangerQuantity;
    }

    public void setHangerQuantity(int hangerQuantity) {
        this.hangerQuantity = hangerQuantity;
    }

    public int getHangerArea() {
        return hangerArea;
    }

    public void setHangerArea(int hangerArea) {
        this.hangerArea = hangerArea;
    }

    public int getHangerLength() {
        return hangerLength;
    }

    public void setHangerLength(int hangerLength) {
        this.hangerLength = hangerLength;
    }

    public int getHangerWidth() {
        return hangerWidth;
    }

    public void setHangerWidth(int hangerWidth) {
        this.hangerWidth = hangerWidth;
    }

    public Hanger(int hangerQuantity, int hangerArea, int hangerLength, int hangerWidth) {
        this.hangerQuantity = hangerQuantity;
        this.hangerArea = hangerArea;
        this.hangerLength = hangerLength;
        this.hangerWidth = hangerWidth;
        this.planes = new ArrayList<Plane>();
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public boolean open(){
        boolean open = false;
        if (planes.size() > 0) open = true;
        return open;
    }

    public boolean close(){
        boolean close = true;
        if (planes.size() > 0) close = false;
        return close;
    }
}
