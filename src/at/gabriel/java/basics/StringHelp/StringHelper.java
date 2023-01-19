package at.gabriel.java.basics.StringHelp;

public class StringHelper {

    public static boolean isPalindrome(String original) {

        original.replace("", "");

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);

        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            return true;
        } else {
            return false;
        }
    }

    public static int countletters(String text, char search) {

        char[] textArray = text.toCharArray();
        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == search) {
                count++;
            }
        }

        return count;
    }

    public static int getAmountOfLetters(String text) {
        return text.length();
    }

    public static String revertString(String text) {

        char[] arr = text.toCharArray();
        int count = 0;
        int half = (arr.length - 1) / 2;
        for (int i = arr.length - 1; i > half; i--) {
            char tmp = arr[i];
            arr[i] = arr[count];
            arr[count] = tmp;
            count++;
        }
        return String.valueOf(arr);
    }

    public static int printAmountOfLetters(String text, char search1) {

        //Anna
        char[] textArray1 = text.toCharArray();

        int lettersCount = 0;

        for (int i = 0; i < textArray1.length; i++) {
            if (search1 == textArray1[i]) {
                lettersCount = lettersCount + 1;
            }
        }


        return lettersCount;

    }
}

