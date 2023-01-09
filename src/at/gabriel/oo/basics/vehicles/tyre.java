package at.gabriel.oo.basics.vehicles;

public class tyre {
    private int size;
    private int type; //Winterreifen, Sommerreifen

    public tyre(int size, int type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
