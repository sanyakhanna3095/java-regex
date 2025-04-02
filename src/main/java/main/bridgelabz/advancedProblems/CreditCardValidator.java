package main.bridgelabz.advancedProblems;

import java.util.*;
import java.util.regex.*;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your credit card number: ");
        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("Valid Visa or MasterCard number.");
        }
        else {
            System.out.println("Invalid credit card number.");
        }
    }

    //method to check if credit card number is valid or not
    public static boolean isValid(String s) {
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5\\d{15}$";

        return Pattern.matches(visaPattern, s) || Pattern.matches(masterCardPattern, s);
    }
}


/*
I/P-> Enter your credit card number:
234567890
O/P-> Invalid credit card number.
 */