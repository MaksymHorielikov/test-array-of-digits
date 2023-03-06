package org.example;

import java.util.*;

public class TesToArrayOfDigits {
    private static final ToArrayOfDigits[] variants = {
            new Variant_1_CharAt(),
            new Variant_2_CharArray(),
            new Variant_3_CharAtAndLocalVariable(),
            new Variant_4_Divide10(),
            new Variant_5_Divide10AndLog10()
    };

    private static int inputIntegerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Invalid input integer number !");
            return inputIntegerNumber();
        }
    }

    public static void main(String[] args) {
        int n = inputIntegerNumber();
        long min = Long.MAX_VALUE;
        Map<Long, ToArrayOfDigits> launchResults = new TreeMap<>();
        for (ToArrayOfDigits variant : variants) {
            long time = System.nanoTime();
            variant.toArrayOfDigits(n);
            time = System.nanoTime() - time;
            if (min > time) {
                min = time;
            }
            launchResults.put(time, variant);
        }
        System.out.printf("\nSorted result launch (n = %,d):\n", n);
        System.out.println("-".repeat(150));
        System.out.printf("%10s", "Time");
        System.out.print(" | ");
        System.out.printf("%15s", "Difference");
        System.out.print(" | ");
        System.out.printf("%12s", "+ Percent");
        System.out.print(" | ");
        System.out.printf("%54s", "Class name");
        System.out.print(" | ");
        System.out.printf("%47s", "Result");
        System.out.println();
        System.out.println("-".repeat(150));

        for (var entry : launchResults.entrySet()) {
            System.out.printf("%,10d", entry.getKey());
            System.out.print(" | ");
            System.out.printf("%,15d", entry.getKey() - min);
            System.out.print(" | ");
            System.out.printf("%,10.2f", ((double) entry.getKey() - min) / (min) * 100);
            System.out.print(" % | ");
            System.out.printf("%54s", entry.getValue().getClass().getSimpleName());
            System.out.print(" | ");
            System.out.printf("%47s", Arrays.toString(entry.getValue().toArrayOfDigits(n)));
            System.out.println();
        }
        System.out.println("-".repeat(150));
    }
}
