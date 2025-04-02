package main.bridgelabz.regexBasicProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String HexCode = sc.nextLine();

        if (isValid(HexCode)) {
            System.out.println("Valid!");
        }
        else {
            System.out.println("Invalid !");
        }

    }

    // method to check if string is valid hex color code or not
    public static boolean isValid(String HexCode){
        String regex="^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex,HexCode);
    }
}


/*
I/P-> Enter a hex color code: #FFA500
O/P-> Valid!
 */