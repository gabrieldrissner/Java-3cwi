package at.gabriel.oo.basics.exampleCars;

public class NewProducer {
    private String producername;
    private String Herkunftsland;
    private double rabatt;

    public NewProducer(String producername, String herkunftsland, double rabatt) {
        this.producername = producername;
        Herkunftsland = herkunftsland;
        this.rabatt = rabatt;
    }

    public String getProducername() {
        return producername;
    }

    public void setProducername(String producername) {
        this.producername = producername;
    }

    public String getHerkunftsland() {
        return Herkunftsland;
    }

    public void setHerkunftsland(String herkunftsland) {
        Herkunftsland = herkunftsland;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
}

