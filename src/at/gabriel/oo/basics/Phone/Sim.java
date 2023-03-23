package at.gabriel.oo.basics.Phone;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private int id;
    private List<PhoneNumber> numbers;

    public Sim(int id) {
        this.id = id;
        this.numbers = new ArrayList<>();

    }

    public void addNumber(PhoneNumber number){
        numbers.add(number);
    }

    public void printNumbers(){
        for (PhoneNumber number: this.numbers) {
            System.out.println("num:" + number.getNumber() + " name:" + number.getName());
        }
    }


}
