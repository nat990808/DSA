class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int maxP = 0;
        for(int i = 0; i<len - 1; i++)
        {
            
            if(prices[i]<min)
            {
            min = prices[i];}
            int temp = prices[i+1]-min;
            if(temp > maxP){
                maxP = temp;
            }
    }
    return maxP;
}}
