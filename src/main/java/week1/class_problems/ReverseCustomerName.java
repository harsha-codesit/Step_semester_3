package week1.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {
        String reverse = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reverse += customerName.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Original: " + name);
        System.out.println("Reversed: " + reverseCustomerName(name));

        sc.close();
    }
}