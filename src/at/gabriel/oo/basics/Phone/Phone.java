package at.gabriel.oo.basics.Phone;

import java.util.List;

public class Phone {
    private String color;
    private Sim sim;
    private Camera camera;
    private SDcard sdCard;

    public Phone(String color, Sim sim, Camera camera, SDcard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;

    }

    public void doCall(String number) {
        this.sim.doCall(number);

    }

    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.sdCard.save(file);

    }

    public List<PhoneFile>getAllFiles() {
       return this.sdCard.getFiles();
    }

    public int getFreeSpace() {
        return this.sdCard.getFreeSpace();
    }

    public String getColor() {
        return color;
    }

    public Sim getSim() {
        return sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public SDcard getSdCard() {
        return sdCard;
    }

}
