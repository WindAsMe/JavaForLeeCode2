import java.util.Arrays;

/**
 * Author     : WindAsMe
 * File       : maxProfit2.java
 * Time       : Create on 18-8-14
 * Location   : ../Home/JavaForLeeCode2/maxProfit2.java
 * Function   : LeetCode No.714
 */
public class maxProfit2 {

    private static int maxProfitResult(int[] prices, int fee) {
        int[] buy = new int[prices.length + 1];
        int[] sell = new int[prices.length + 1];

        buy[0] = -prices[0];
        for(int i = 1; i < prices.length; i++) {
            System.out.println("buy b: " + Arrays.toString(buy));
            System.out.println("sell b: " + Arrays.toString(sell));
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
            System.out.println("buy a: " + Arrays.toString(buy));
            System.out.println("sell a: " + Arrays.toString(sell));
        }
        return sell[prices.length - 1];
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        System.out.println(maxProfitResult(prices, 2));
    }
}
