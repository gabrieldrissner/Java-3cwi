package at.gabriel.oo.basics.Phone;

public class Phone {
    private String color;
    private Sim sim;
    private Camera camera;
    private SDcard sdCard;

    public Phone(String color, Sim sim, Camera camera,SDcard sdCard){
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;

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

  //public PhoneFile getPhoneFile() {
   //   return phoneFile;
    }
