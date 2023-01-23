package at.gabriel.oo.basics.batteries;


import at.gabriel.oo.basics.vehicles.Engine;

public class RemoteTester {
    public static void main(String[] args) {




        Battery battery1 = new Battery(50);
        Battery battery2 = new Battery(80);

        Remote remote1 = new Remote(battery1,battery2);

        System.out.println("Akkustand " + remote1.getStatus() + " Prozent");

        System.out.println(battery1.getState());
        System.out.println(battery2.getState());
    }
}
