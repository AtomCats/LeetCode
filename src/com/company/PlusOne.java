package com.company;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int counter = 0;
        int end = digits.length - 1;
        int k = digits.length - 1;
        if( digits[k] != 9 ) {
            digits[k] = digits[k] + 1;
        } else {
            while(k >= 0 && digits[k] == 9)
            {
                digits[k--] = 0;
            }
            if(k >= 0) {
                digits[k] = digits[k] + 1;
            }

        }
        if(k<0 && digits[k+1]==0) {
           int[] temp = new int[digits.length+1];
           temp[0] = 1;
            System.arraycopy(digits, 0, temp, 1, digits.length);
           return temp;
        }
        return digits;
    }
}
