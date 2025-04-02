package main.bridgelabz.modifyReplace;

import java.util.Scanner;

public class SpaceReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text with multiple spaces: ");
        String inputString = sc.nextLine();

        String outputString = replaceMultipleSpaces(inputString);
        System.out.println("Text with single spaces: " + outputString);
    }


    // method to find and replace one or more whitespace characters
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
}

/*
I/P-> Enter the text with multiple spaces:    This is an example with multiple      spaces.
O/P-> Text with single spaces:  This is an example with multiple spaces.

 */