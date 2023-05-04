package at.gabriel.oo.basics.Camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<File> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }



    public void printFiles() {
        for (File file : this.files) {
            System.out.println(file.getName() + " size:" + file.getType());
        }

    }
}
