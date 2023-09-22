package at.gabriel.oo.basics.Repition_PlaneExample;

public class Wings {
    private int wingsQuantity;
    private int wingsWidth;

    public int getWingsQuantity() {
        return wingsQuantity;
    }

    public void setWingsQuantity(int wingsQuantity) {
        this.wingsQuantity = wingsQuantity;
    }

    public int getWingsWidth() {
        return wingsWidth;
    }

    public void setWingsWidth(int wingsWidth) {
        this.wingsWidth = wingsWidth;
    }

    public Wings(int wingsQuantity, int wingsWidth) {
        this.wingsQuantity = wingsQuantity;
        this.wingsWidth = wingsWidth;
    }
}
