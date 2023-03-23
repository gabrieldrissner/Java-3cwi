package at.gabriel.oo.basics.Phone;

public class Camera {
    private int fileNumber = 0;

    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("jpeg", 800, "pic" + fileNumber);
        fileNumber++;
        return file;
    }


}
