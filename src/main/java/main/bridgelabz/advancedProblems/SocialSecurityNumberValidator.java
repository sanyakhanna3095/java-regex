package main.bridgelabz.advancedProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocialSecurityNumberValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the potential SSN: ");
        String s = sc.nextLine();

        // Extract SSN from input
        String ssn = s.replaceAll("[^\\d-]", "");

        // Validate SSN and print result
        System.out.println((isValid(ssn) ? "\"" + ssn + "\" is valid" : "\"" + ssn + "\" is invalid"));
    }

    // Method to validate SSN format
    public static boolean isValid(String ssn) {
        // Regular expression pattern for SSN format: XXX-XX-XXXX
        String regex = "\\d{3}-\\d{2}-\\d{4}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern with the input SSN
        Matcher matcher = pattern.matcher(ssn);

        // Return whether the SSN is valid or not
        return matcher.matches();
    }

}


/*
I/P-> Enter the potential SSN: My SSN is 123-45-6789.
O/P-> "123-45-6789" is valid
 */