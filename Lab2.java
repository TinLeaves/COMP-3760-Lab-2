import java.util.ArrayList;

public class Lab2 {

    public ArrayList<String> generatePalindromeSequences(int N) {
        // Initialize an ArrayList to store the palindrome sequences
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

        // Append 'A', 'B', and 'C' to the smaller sequences, creating palindromes
        for (String s : smallerSequences) {
            result.add("A" + s + "A");
            result.add("B" + s + "B");
            result.add("C" + s + "C");
        }

        // Return the list of generated palindrome sequences
        return result;
    }

}
