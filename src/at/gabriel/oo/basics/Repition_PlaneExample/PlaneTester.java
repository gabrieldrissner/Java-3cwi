package at.gabriel.oo.basics.Repition_PlaneExample;

public class PlaneTester {
    public static void main(String[] args) {
        Wings w1 = new Wings(10,30);
        PowerPlants engine1 = new PowerPlants(200,2,"back");
        Tank t1 = new Tank(500);
        Hanger h1 = new Hanger(300,400,200,300);

        Plane p1 = new Plane("white",100,1000,50,350,250,150,w1,engine1,t1);
        Plane p2 = new Plane("black",100,300,300,800,50,93,w1,engine1,t1);

        Airbus_A4320 Airbus1 = new Airbus_A4320("green",45,49,300,700,54,80,w1,engine1,t1,30,50);

        Airpot a1 = new Airpot(9000,90,859,45,70,40,h1);
        System.out.println(p1.getPlaneHeight());

        h1.addPlane(p1);
        h1.addPlane(p2);

        System.out.println(h1.getPlanes());

        System.out.println(Airbus1.landing());

        System.out.println(a1.checkIn());

        System.out.println(t1.tankState());

        a1.addHanger(h1);

        System.out.println(a1.getHangers());



    }


}
