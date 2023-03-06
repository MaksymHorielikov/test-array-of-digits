package org.example;

public class Variant_4_Divide10 extends AbstractArrayOfDigits {
    @Override
    public int[] toArrayOfDigits(int n) {
        n = Math.abs(n);
        int [] result = new int[String.valueOf(n).length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = n % 10;
            n /= 10;
        }
        return result;
    }
}
