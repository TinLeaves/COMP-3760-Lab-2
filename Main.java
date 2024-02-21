import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lab2 lab2 = new Lab2();

        for (int i = 1; i <= 10; i++) {
            ArrayList<String> sequences = lab2.generatePalindromeSequences(i);
            System.out.println("Length " + i + " produces " + sequences.size() + " sequences:");
            System.out.println(sequences);
            System.out.println();
        }
    }
}