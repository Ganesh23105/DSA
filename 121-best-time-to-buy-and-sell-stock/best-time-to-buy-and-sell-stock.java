class Solution {
    public int maxProfit(int[] prices) {
        int mincost=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mincost;
            profit=Math.max(cost,profit);
            mincost=Math.min(prices[i],mincost);
        }
        return profit;
        
    }
}