package week1.assignment_problems;

import java.util.Scanner;

public class MovieReviewWordProfiler {

    static void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {

            int length = word.length();

            if (length <= 4)
                shortCount++;
            else if (length <= 8)
                mediumCount++;
            else
                longCount++;
        }

        System.out.println("Short words: " + shortCount);
        System.out.println("Medium words: " + mediumCount);
        System.out.println("Long words: " + longCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);

        sc.close();
    }
}