package main.bridgelabz.advancedProblems;

import java.util.*;
import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing programming languages:");
        String s = sc.nextLine();

        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|C|Swift|Kotlin|PHP|Ruby|R|TypeScript|Rust|Perl|Dart|Scala)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        if (languages.isEmpty()) {
            System.out.println("No programming languages found.");
        }
        else {
            System.out.println("Extracted programming languages: " + languages);
        }
    }
}
