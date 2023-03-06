package org.example;

public class Variant_3_CharAtAndLocalVariable implements ToArrayOfDigits {
    @Override
    public int[] toArrayOfDigits(int n) {
        String digitsStr = String.valueOf(Math.abs(n));
        int indexLast = digitsStr.length() - 1;
        int [] result = new int[digitsStr.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = digitsStr.charAt(indexLast - i) - 48;
        }
        return result;
    }
}
