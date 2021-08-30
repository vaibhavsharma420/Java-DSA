class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            int profit = prices[i] - min;
            max = Math.max(profit, max);
        }
        return max;
    }
}