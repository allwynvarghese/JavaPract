package Arrays;

import java.util.Arrays;

public class SortingAnArray {

    public static void main(String[] args) {

        String [] words = {"Elephant", "Sunshine", "Ocean", "Arrow", "Earth", "Watch"};

        Arrays.sort(words);

        Arrays.stream(words).forEach(s-> System.out.print(" "+ s + " "));
    }
}
