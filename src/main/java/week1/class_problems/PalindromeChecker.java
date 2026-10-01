package week1.class_problems;

import java.util.Scanner;

public class PalindromeChecker {

    static boolean iterative(String text) {
        int i = 0, j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean recursive(String text, int i, int j) {
        if (i >= j)
            return true;

        if (text.charAt(i) != text.charAt(j))
            return false;

        return recursive(text, i + 1, j - 1);
    }

    static boolean arrayReverse(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return new String(arr).equals(new String(rev));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " + iterative(text));
        System.out.println("Recursive: " + recursive(text, 0, text.length() - 1));
        System.out.println("Array Reverse: " + arrayReverse(text));

        sc.close();
    }
}