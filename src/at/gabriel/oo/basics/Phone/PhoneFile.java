package at.gabriel.oo.basics.Phone;

import java.util.List;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getInfo(){
        return this.extension + ":" + this.name + ":" + this.size;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
