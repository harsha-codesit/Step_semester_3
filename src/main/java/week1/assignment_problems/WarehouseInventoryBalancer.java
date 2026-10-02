package week1.assignment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        if (totalA == totalB)
            System.out.println("Inventory is Balanced");
        else
            System.out.println("Inventory is Not Balanced");

        int highest = sectionA[0];
        String section = "A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "A";
                index = i;
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "B";
                index = i;
            }
        }

        System.out.println("Highest Quantity: " + highest);
        System.out.println("Section: " + section);
        System.out.println("Index: " + index);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++)
            sectionA[i] = sc.nextInt();

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++)
            sectionB[i] = sc.nextInt();

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}