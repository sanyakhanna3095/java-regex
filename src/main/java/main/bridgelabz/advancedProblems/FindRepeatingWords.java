package main.bridgelabz.advancedProblems;

import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);

        Set<String> repeatedWords = new HashSet<>();
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        if (repeatedWords.isEmpty()) {
            System.out.println("No repeating words found.");
        }
        else {
            System.out.println("Repeating words: " +  repeatedWords);
        }
    }
}


/*
I/P->
Enter a sentence:
This is is a repeated repeated word test.

O/P->
Repeating words: [is, repeated]
 */