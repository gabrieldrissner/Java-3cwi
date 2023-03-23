package at.gabriel.oo.basics.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private int capacity;
    private List<PhoneFile> files;

    public SDcard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(PhoneFile file){
        files.add(file);
    }
}
