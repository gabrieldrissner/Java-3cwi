package at.gabriel.java.basics.basics;

public class Array {
    private static final int KEY = 2;

    public static void main(String[] args) {
        String result = crypto("Hallo", true);
        System.out.println("Verschlüsselung: " + result);
        result = crypto(result, false);
        System.out.println("Entschlüsselung: " + result);
    }

    /**
     * Method to encrypt or decrypt a String.
     * @param stringToEncrypt String
     * @param encrypt if true encrypt, else decrypt
     * @return encrypted or decrypted value
     */
    public static String crypto(String stringToEncrypt, boolean encrypt) {
        char[] chars = stringToEncrypt.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char aChar : chars) {
            int letterCode = encrypt ? aChar + KEY : aChar - KEY;
            result.append(Character.toString(letterCode));
        }
         return result.toString();
    }
}
