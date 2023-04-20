package at.gabriel.oo.basics.Phone;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1);
        SDcard sDcard = new SDcard(5000);
        Camera camera = new Camera();

        Phone phone = new Phone("black", sim, camera, sDcard);
      PhoneGUI phoneGUI = new PhoneGUI(phone);
      phoneGUI.run();




    }
}
