package main.bridgelabz.extractionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the text.
        System.out.print("Enter the text from which you want to extract links: ");
        String s = sc.nextLine();

        // Call the extractLinks method with the user's input.
        List<String> l = extractLinks(s);

        String res = String.join(", ", l);
        System.out.println("Extracted Links: " + res);
    }

    //method to extract link from a string
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        String regex = "http[s]?://(?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}


/*
I/P-> Enter the text from which you want to extract links: Visit https://www.google.com and http://example.org for more info.
O/P-> Extracted Links: https://www.google.com, http://example.org
 */