package week1.assignment_problems;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {

        char longestColor = signalLog.charAt(0);
        int longest = 1;

        char currentColor = signalLog.charAt(0);
        int current = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == currentColor) {
                current++;
            } else {
                currentColor = signalLog.charAt(i);
                current = 1;
            }

            if (current > longest) {
                longest = current;
                longestColor = currentColor;
            }
        }

        System.out.println("Longest streak: " + longestColor);
        System.out.println("Length: " + longest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine().toUpperCase();

        findLongestStreak(signalLog);

        sc.close();
    }
}