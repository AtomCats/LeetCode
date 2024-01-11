package com.company;

public class Buy_Sell {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int min = 0;
        int max = 0;
        int start = 0;
        int iterationSum = 0;

        for (int a = 0; a < prices.length; a++) {

            for (int i = a; i < prices.length; i++) {
                int maxSum = 0;
                int rowSum = 0;
                for (int k = i + 1; k < prices.length; k++) {
                    if (prices[i] < prices[k] && (prices[k] - prices[i]) > rowSum) {
                        rowSum += prices[k] - prices[i];
                    }
                }
                iterationSum += maxSum;

            }
            if (iterationSum > sum) {
                sum = iterationSum;
            }
            iterationSum = 0;
        }

        return sum;
    }

    public int buySellSolution(int[] prices) {


        int profitSum = 0;
        boolean skipTransaction = false;
        for (int i = 0; i < prices.length; i++) {
            boolean transactionFound = false;
            boolean anotherTransactionMark = false;
            boolean anotherTransactionFound = false;
            int anotherTransactionMinPrice = 0;
            int anotherTransactionProfit = 0;
            int transactionProfit = 0;
            int transactionMaxPrice = 0;
            int transactionMinPrice = 0;
            int transactionMaxPriceDay = 0;
            for (int j = i; j < prices.length; j++) {
                if (transactionFound && !anotherTransactionMark && prices[j] < transactionMaxPrice) {
                    anotherTransactionMark = true;
                    anotherTransactionMinPrice = prices[j];
                } else if (anotherTransactionMark && prices[j] > anotherTransactionMinPrice) {
                    anotherTransactionProfit = prices[j] - anotherTransactionMinPrice;
                    if (anotherTransactionProfit + transactionProfit > prices[j] - transactionMinPrice) {
                        anotherTransactionFound = true;
                        break;
                    }
                }
                if(prices[j] < prices[i] && !anotherTransactionFound) {
                    skipTransaction = true;
                }
                if (prices[j] > transactionMaxPrice && prices[j] > prices[i] && !anotherTransactionFound) {
                    transactionFound = true;
                    transactionMaxPrice = prices[j];
                    transactionMinPrice = prices[i];
                    transactionProfit = transactionMaxPrice - prices[i];
                    transactionMaxPriceDay = j;
                }
            }
            i = skipTransaction || !transactionFound ? i : transactionMaxPriceDay;
            profitSum += transactionProfit;
        }
        return profitSum;
    }

//    public int findMaxProfit(int[] prices) {
//        boolean transactionFound = false;
//        boolean anotherTransactionMark = false;
//        boolean anotherTransactionFound = false;
//        int anotherTransactionMinPrice = 0;
//        int anotherTransactionProfit = 0;
//        int transactionProfit = 0;
//        int transactionMaxPrice = 0;
//        int transactionMinPrice = 0;
//        int transactionMaxPriceDay = 0;
//        int profitSum = 0;
//        for (int i = 0; i < prices.length; i++) {
//            int j = i;
//            while (j != 0) {
//                transactionProfit = getNextProfit(i, j, prices);
//            }
//        }
//    }

    private int getNextProfit(int i, int j, int[] prices) {
        int transactionProfit = 0;
        for (int b = j; b < prices.length; b++) {
            if (prices[b] > prices[i]) {
                transactionProfit = prices[b] - prices[i];
                j = b;
            }
        }
        return transactionProfit;
    }

    public int maxProfit1(int[] arr) {
        int maxprofit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                maxprofit += arr[i] - arr[i - 1];
            }
        }
        return maxprofit;
    }

    public static int maxProfit2(int[] arr) {
        int maxprofit = 0;

        // To store the valley i.e the lowest price for a new transaction.
        int valley = arr[0];

        // To store the peak i.e the maximum price for a new transaction.
        int peak = arr[0];

        for (int i = 1; i < arr.length; i++) {
    	    /* If the current price is not less than previous price,
    	       it will be the new peak
        	       for current transaction.*/
            if (arr[i] >= arr[i - 1]) {
                peak = arr[i];

                // If the last price is a peak value.
                if (i == arr.length - 1)
                    maxprofit += peak - valley;
            }
            else {
                /* We found a new valley, so we
                    will end our current transaction completes.*/
                maxprofit += peak - valley;

                // New transaction should start from ith day.
                valley = arr[i];
                peak = valley;
            }
        }
        return maxprofit;
    }

}
