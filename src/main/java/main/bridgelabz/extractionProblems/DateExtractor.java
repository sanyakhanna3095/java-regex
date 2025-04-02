package main.bridgelabz.extractionProblems;

import java.util.*;
import java.util.regex.*;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter text: ");
        String s = sc.nextLine();

        // Extract dates from the input text
        List<String> dates = extractDates(s);
        if (dates.isEmpty()) {
            System.out.println("No dates found.");
        } else {
            System.out.println("Extracted dates:");
            System.out.println(String.join(", ", dates));
        }
    }

    // Method to extract dates in dd/mm/yyyy format from a given string
    public static List<String> extractDates(String s) {
        // Regular expression pattern to match dates in dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        // List to store extracted dates
        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}


/*
I/P-> Enter text:
The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.


O/P->
Extracted dates:
12/05/2023, 15/08/2024, 29/02/2020
 */