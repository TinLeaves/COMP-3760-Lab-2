import java.util.ArrayList;

public class Lab2 {

    public ArrayList<String> generatePalindromeSequences(int N) {
        // Initialize an ArrayList to store the palindrome sequences
        ArrayList<String> result = new ArrayList<>();
        // Call the helper function to generate palindrome sequences
        generatePalindromesHelper(N, result);
        // Return the list of generated palindrome sequences
        return result;
    }

    private void generatePalindromesHelper(int N, ArrayList<String> result) {
        // Base case: when N is 0, add an empty string to the result
        if (N == 0) {
            result.add("");
            return;
        }

        // Base case: when N is 1, add single-character palindromes to the result
        if (N == 1) {
            result.add("A");
            result.add("B");
            result.add("C");
            return;
        }

        // Recursively generate smaller palindrome sequences with N-2 characters
        ArrayList<String> smallerSequences = new ArrayList<>();
        generatePalindromesHelper(N - 2, smallerSequences);

        // Append 'A', 'B', and 'C' to the smaller sequences, creating palindromes
        for (String s : smallerSequences) {
            result.add("A" + s + "A");
            result.add("B" + s + "B");
            result.add("C" + s + "C");
        }
    }
}
