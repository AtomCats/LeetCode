package com.company;


public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while(x!=0) {
            int temp = x %10;
            x /=10;
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10)
                return 0;
            result = result * 10 + temp;
        }

        return result;
    }

    public static void main(String[] args) {
            int example = 1534236469;
            int res = reverse(example);
        System.out.println(res);
    }
}
