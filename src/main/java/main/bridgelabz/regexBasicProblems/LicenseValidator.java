package main.bridgelabz.regexBasicProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicenseValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Take user input for license plate number
        System.out.println("Enter your license plate number: ");
        String s=sc.nextLine();

        if(isValid(s)){
            System.out.println("Valid !");
        }
        else{
            System.out.println("Invalid !");
        }
    }


    // method to check if string is valid license or not
    public static boolean isValid(String s){
        String regex = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, s);
    }
}


/*
I/P-> Enter your license plate number:
AX1234
O/P-> Valid !

 */