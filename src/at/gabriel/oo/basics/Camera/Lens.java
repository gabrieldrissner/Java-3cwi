package at.gabriel.oo.basics.Camera;

public class Lens {
    private Producer producer;
    private int focalLength;

    public Lens(Producer producer, int focalLength) {
        this.producer = producer;
        this.focalLength = focalLength;
    }
}
