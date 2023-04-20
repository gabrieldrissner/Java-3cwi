package at.gabriel.oo.basics.Phone;

import java.util.List;
import java.util.Scanner;

public class PhoneGUI {
    private Phone phone;

    public PhoneGUI(Phone phone) {
        this.phone = phone;
    }

    public void run() {
        System.out.println("Wilkommen beim Nokia");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 call, 2 picture, 3 Get free Space, 4 Dateinamen anzeigen ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    phone.doCall("137392733");
                    break;
                case 2:
                    phone.takePicture();
                    break;
                case 3:
                    System.out.println("noch frei " + phone.getFreeSpace());
                    break;
                case 4:
                    List<PhoneFile> files = phone.getAllFiles();
                    for (PhoneFile file : files
                    ) {
                        System.out.println(file.getInfo());

                    }
                    break;
            }

        }
    }
}
