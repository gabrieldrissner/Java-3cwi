import java.util.Random;

public class switch1 {
    public static void main(String[] args) {
        System.out.println("hello");

        Random random = new Random(5);
        int randomnumber = random.nextInt(10);

        System.out.println(randomnumber);

        switch (randomnumber){
            case 10:
                System.out.println("ten");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
        }
    }
}