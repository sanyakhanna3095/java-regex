package main.bridgelabz.extractionProblems;

import java.util.*;
import java.util.regex.*;

public class EmailExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input for text
        System.out.println("Enter text to extract emails from:");
        String s = sc.nextLine();

        // Extract email addresses from the input text
        List<String> list = extractEmails(s);

        // Check if any email addresses were found
        if (list.isEmpty()) {
            System.out.println("No email addresses found.");
        }
        else {
            System.out.println("Extracted email addresses:");
            for (String email : list) {
                System.out.println(email);
            }
        }

    }


    // Method to extract email addresses from a given string
    public static List<String> extractEmails(String s) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        List<String> l = new ArrayList<>();
        while (matcher.find()) {
            l.add(matcher.group());
        }
        return l;
    }
}



/*
I/P->
Enter text to extract emails from:
Contact us at support@example.com and info@company.org


O/P->
Extracted email addresses:
support@example.com
info@company.org

 */