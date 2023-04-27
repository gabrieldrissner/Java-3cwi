package at.gabriel.oo.basics.Camera;



public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Austria","Feldkircher Companys");
        SDCard sDcard = new SDCard(16);
        Lens lens = new Lens(producer,52);
        Camera camera = new Camera(120,12,"black",producer,lens,sDcard);

        camera.makePicture();
        camera.makePicture();
        camera.makePicture();
        camera.getsDcard().printFiles();
    }
}
