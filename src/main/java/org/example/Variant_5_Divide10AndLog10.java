package org.example;

public class Variant_5_Divide10AndLog10 implements ToArrayOfDigits {
    @Override
    public int[] toArrayOfDigits(int n) {
        n = Math.abs(n);
        int size = 1;
        if (n > 0) {
            double log = Math.log10(n);
            size = log == (int) log ? (int)log + 1 : (int) Math.ceil(log);
        }
        int [] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = n % 10;
            n /= 10;
        }
        return result;
    }
}
