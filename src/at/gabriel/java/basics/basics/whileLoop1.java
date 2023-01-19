package at.gabriel.java.basics.basics;

import java.util.Random;

public class whileLoop1 {
    public static void main(String[] args) {
        System.out.println("test");

        Random random = new Random();

        boolean isFinished= false;
        int a=0;

        while(!isFinished){
            int randomnumber = random.nextInt(10,30);
            System.out.println("Nr:"+randomnumber);
            if(randomnumber==15 || randomnumber==25){
                isFinished=true;

            }
            else{
                a=a+randomnumber;
            }
        }
        System.out.println(a);

    }
}
