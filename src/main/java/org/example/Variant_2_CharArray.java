package org.example;

public class Variant_2_CharArray extends AbstractArrayOfDigits {
     @Override
    public int[] toArrayOfDigits(int n) {
        char[] digits = String.valueOf(Math.abs(n)).toCharArray();
        int [] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i] = digits[digits.length - 1 - i] - '0';
        }
        return result;
    }
}
