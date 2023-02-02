package at.gabriel.java.basics.basics;

import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        char[] arr = t.toCharArray();

        String upper = "";
        String lower = "";
        int i = 0;

        for (i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                upper += arr[i];
            }
            else {
                lower += arr[i];
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}