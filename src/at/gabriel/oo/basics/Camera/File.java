package at.gabriel.oo.basics.Camera;

public class File {
    private String name;


    public enum TYPE {klein, mittel, groß}

    private at.gabriel.oo.basics.Camera.File.TYPE type;

    public File(String extension, TYPE type) {
        this.name = name;
        this.type = type;
    }

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public TYPE getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
