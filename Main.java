import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            ArrayList<String> sequences = Lab2.generatePalindromeSequences(i);
            System.out.println("Length " + i + " produces " + sequences.size() + " sequences:");
            System.out.println(sequences);
            System.out.println();
        }
    }
}