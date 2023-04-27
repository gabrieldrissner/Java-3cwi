package at.gabriel.oo.basics.Camera;


import at.gabriel.oo.basics.Phone.PhoneFile;

public class Camera {
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private SDCard sDcard;

    public Camera(int pixel, int weight, String color, Producer producer, Lens lens, SDCard sDcard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.sDcard = sDcard;
    }

    public void makePicture(){
            File file = new File("picture1","klein");


        }

    public SDCard getsDcard() {
        return sDcard;
    }

    public void setsDcard(SDCard sDcard) {
        this.sDcard = sDcard;
    }
}
