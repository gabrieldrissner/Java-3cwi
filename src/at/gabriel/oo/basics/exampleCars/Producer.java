package at.gabriel.oo.basics.exampleCars;

public class Producer {
    private String producername;
    private String origin;
    private double rabatt;


    public Producer(String producername, String origin, double rabatt) {
        this.producername = producername;
        origin = origin;
        this.rabatt = rabatt;
    }


    public String getProducername() {
        return producername;
    }

    public void setProducername(String producername) {
        this.producername = producername;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
}

