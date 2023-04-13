package at.gabriel.oo.basics.Phone;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera();
        Sim sim = new Sim(1);
        SDcard sDcard = new SDcard(18);

        Phone phone = new Phone("black",sim,camera,sDcard);

        sim.addNumber(new PhoneNumber("Gabriel","1234"));
        sim.addNumber(new PhoneNumber("Hans", "823"));

        sim.printNumbers();
        PhoneFile phoneFile = new PhoneFile("jpeg",12,"OnklSam");
        System.out.println(camera.takePicture());
        System.out.println(phoneFile);




    }
}
