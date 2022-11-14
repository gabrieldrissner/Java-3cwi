package at.run.basics;

public class MainStringHelper {
    public static void main(String[] args) {
        boolean isPalindrome = StringHelper.isPalindrome("a");
        System.out.println(isPalindrome);

        System.out.println(StringHelper.countletters("Haannnsia",'a'));

        System.out.println(StringHelper.revertString("Gabriel"));

        System.out.println(StringHelper.printAmountOfLetters("Anna",'a'));
    }
}
