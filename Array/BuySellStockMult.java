package Array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
public class BuySellStockMult {
    // valley and peak
    public int solution1(int[] prices) {
        int buy, sell = 0;
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i+1] > prices[i]) {
                buy = prices[i];

                while (i < prices.length - 1 && prices[i+1] > prices[i]) {
                    i++;
                }
                sell = prices[i];

                profit+= sell - buy;
            }
        }
        
        return profit;
    }


}