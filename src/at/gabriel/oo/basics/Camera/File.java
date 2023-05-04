package at.gabriel.oo.basics.Camera;

public class File {
    private String name;
    private String extension;

    public enum FILE_SIZE {klein, mittel, groß}

    private at.gabriel.oo.basics.Camera.File.FILE_SIZE type;

    public File(String name, String extension, FILE_SIZE type) {
        this.name = name;
        this.type = type;
        this.extension=extension;
    }


    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public FILE_SIZE getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
