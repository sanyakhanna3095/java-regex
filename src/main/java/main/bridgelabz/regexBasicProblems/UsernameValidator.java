package main.bridgelabz.regexBasicProblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Take user input for username
        System.out.println("Enter your username: ");
        String s=sc.nextLine();

        if(isValid(s)){
            System.out.println("Valid !");
        }
        else{
            System.out.println("Invalid !");
        }
    }


    // method to check if string is valid username or not
    public static boolean isValid(String s){
        String regex= "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, s);
    }
}


/*
I/P-> Enter your username:
123@gmail.com
O/P-> Invalid !
 */