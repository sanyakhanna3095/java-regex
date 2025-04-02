# Java Regex

- Regular Expressions  
- sequence of characters defining a search pattern  
- java.util.regex package  
- used for validations, searching, text manipulation, and data extraction


# Java Regex API
Pattern and Matcher Classes
1. Pattern → compiled regex pattern.
2. Matcher → Performs operations like searching, matching, and replacing.



When Should You Compile a Regex?
✅ Use Pattern.compile() when:

The regex will be used multiple times (e.g., validating multiple usernames in a loop).
You want better performance since compilation is done only once.
❌ You don’t need Pattern.compile() when:

The regex is used only once (e.g., a single username validation).