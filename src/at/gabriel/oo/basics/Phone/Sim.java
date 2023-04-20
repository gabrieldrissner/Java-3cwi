package at.gabriel.oo.basics.Phone;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private int id;
    private String number;

    public Sim(int id) {
        this.id = id;
        this.number = number;

    }


    public void doCall(String number) {
        System.out.println("Calling " + number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}




