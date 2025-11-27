class Solution(object):
    def maxProfit(self, prices):
        n=len(prices)
        ans=0
        min_price=prices[0]

        for i in range(1,n):
            current_profit=prices[i]-min_price
            ans=max(current_profit,ans)
            min_price=min(min_price,prices[i])

        return ans 
        