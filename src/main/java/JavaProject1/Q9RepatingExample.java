package JavaProject1;

import java.util.HashMap;
import java.util.Map;

public class Q9RepatingExample {
    /*
    Find the First Non-Repeating Character in a String: Given a string, find and
   return the first non-repeating character. For example, in the string
   "abracadabra", the first non-repeating character is 'c'.
     */
    public static void main(String[] args) {
        String input = "abracadabra";
        char firstNonRepeating = findFirstNonRepeatingChar(input);
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
    public static char findFirstNonRepeatingChar(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCount.get(ch) == 1) {
                return ch;
    }
        }
        return '\0';
    }
}
