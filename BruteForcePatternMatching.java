// Problem:
// Given a text string and a pattern string, determine whether the pattern exists in the text using brute force.

// Brute-Force Algorithm
// The brute-force approach checks for the pattern by trying every possible starting position in the text. For each starting position, it checks whether the pattern matches the text.


public class BruteForcePatternMatching {

    // Brute-force algorithm to find if pattern exists in text
    public static int bruteForceSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        // Iterate through the text and try every possible starting position
        for (int i = 0; i <= textLength - patternLength; i++) {
            System.out.println("Checking starting position: " + i);
            int j;

            // Check if the pattern matches the substring in the text
            for (j = 0; j < patternLength; j++) {
                System.out.println("Comparing text[" + (i + j) + "] = '" + text.charAt(i + j)
                        + "' with pattern[" + j + "] = '" + pattern.charAt(j) + "'");

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    System.out.println("Character mismatch at position " + (i + j) + " in the text.");
                    break;
                }
            }

            // If the pattern matches completely, return the index of occurrence
            if (j == patternLength) {
                System.out.println("Pattern found at starting position: " + i);
                return i; // Pattern found at index i
            }

            System.out.println("Pattern not found at starting position: " + i + "\n");
        }
        return -1; // Pattern not found
    }

    public static void main(String[] args) {
        String text = "Hello, this is a simple example.";
        String pattern = "simple";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern + "\n");

        int result = bruteForceSearch(text, pattern);

        if (result == -1) {
            System.out.println("\nPattern not found in the text.");
        } else {
            System.out.println("\nPattern found at index: " + result);
        }
    }

}


// Explanation
// The bruteForceSearch method takes two parameters: the text and the pattern.
// The outer loop (for (int i = 0; i <= textLength - patternLength; i++)) checks each possible starting position in the text.
// The inner loop (for (j = 0; j < patternLength; j++)) checks whether the characters in the pattern match the characters in the text starting at position i.
// If the pattern matches completely, it returns the starting index i.
// If no match is found after checking all positions, the function returns -1.