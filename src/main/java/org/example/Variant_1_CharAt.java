package org.example;

public class Variant_1_CharAt implements ToArrayOfDigits {
    @Override
    public int[] toArrayOfDigits(int n) {
        String digitsStr = String.valueOf(Math.abs(n));
        int [] result = new int[digitsStr.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = digitsStr.charAt(digitsStr.length() - 1 - i) - 48;
        }
        return result;
    }
}
