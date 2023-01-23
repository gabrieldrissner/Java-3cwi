package at.gabriel.oo.basics.basicCar;

public class tyre {

    public enum TYPE {Winterreifen, Sommerreifen}

    private int size;

    private TYPE type;

    public tyre(int size, TYPE type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
