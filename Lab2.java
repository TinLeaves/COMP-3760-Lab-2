import java.util.ArrayList;

/**
 * Lab2 class generates palindrome sequences representing different light colors.
 * Contains two methods for palindrome generation:
 * - generatePalindromeSequences: Generates palindromes of a specified length.
 * - palindromeDonut: Generates palindromes with a specified length and number of colors.
 *
 * @author Steven Lai (A01276696), Set C
 * @version 2024
 */
public class Lab2 {

    /**
     * Generates palindrome sequences of length N that contain (up to) 3 different letters.
     * Uses characters 'A', 'B', and 'C' to represent red, white, and green light respectively.
     *
     * @param N The length of the palindrome sequences to generate.
     * @return ArrayList of palindrome sequences.
     */
    public ArrayList<String> generatePalindromeSequences(int N) {
        // Initialize an ArrayList called results to store the palindrome sequences
        ArrayList<String> result = new ArrayList<>();

        // Base case: when N is 0, add an empty string to the result
        if (N == 0) {
            result.add("");
            return result;
        }

        // Base case: when N is 1, add single-character palindromes to the result
        if (N == 1) {
            result.add("A");
            result.add("B");
            result.add("C");
            return result;
        }

        // Recursively generate smaller palindrome sequences with N-2 characters
        ArrayList<String> smallerSequences = generatePalindromeSequences(N - 2);

        // Append 'A', 'B', and 'C' to the smaller sequences, creating all the possible palindromes for that given length
        for (String s : smallerSequences) {
            result.add("A" + s + "A");
            result.add("B" + s + "B");
            result.add("C" + s + "C");
        }

        // Return the list of generated palindrome sequences
        return result;
    }

    /**
     * Generates palindrome sequences with a specified number of colors and length N.
     *
     * @param N          The length of the palindrome sequences to generate.
     * @param numColours The number of colors to use represented by ('A', 'B','C'...).
     * @return ArrayList of palindrome sequences.
     */
    public ArrayList<String> palindromeDonut(int N, int numColours) {
        // Initialize an ArrayList called result to store the palindrome sequences
        ArrayList<String> result = new ArrayList<>();

        // Base case: when N is 0, add an empty string to the result
        if (N == 0) {
            result.add("");
            return result;
        }

        // Base case: when N is 1, add single-character palindromes to the result
        if (N == 1) {
            for (int i = 0; i < numColours; i++) {
                char currentChar = (char) ('A' + i);
                result.add(String.valueOf(currentChar));
            }
            return result;
        }

        // Recursively generate smaller palindrome sequences with N-2 characters
        ArrayList<String> smallerSequences = palindromeDonut(N - 2, numColours);

        // Append characters based on the specified number of colours to the smaller sequences, creating palindromes
        for (int i = 0; i < numColours; i++) {
            char currentChar = (char) ('A' + i);
            for (String s : smallerSequences) {
                result.add(currentChar + s + currentChar);
            }
        }

        // Return the list of generated palindrome sequences
        return result;
    }
}
