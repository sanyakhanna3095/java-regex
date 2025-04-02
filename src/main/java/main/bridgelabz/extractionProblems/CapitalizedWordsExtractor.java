package main.bridgelabz.extractionProblems;

import java.util.*;
import java.util.regex.*;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter text: ");
        String s = sc.nextLine();

        // Extract capitalized words from the input text
        List<String> list = extractCapitalizedWords(s);


        if (list.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("Extracted capitalized words:");
            System.out.println(String.join(", ", list));
        }
    }

    // Method to extract capitalized words from a given string
    public static List<String> extractCapitalizedWords(String s) {
        // Regular expression pattern to match capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        // List to store extracted capitalized words
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
}


/*
I/P->
Enter text:
The Eiffel Tower is in Paris and the Statue of Liberty is in New York.


O/P->
Extracted capitalized words:
The, Eiffel, Tower, Paris, Statue, Liberty, New, York
 */