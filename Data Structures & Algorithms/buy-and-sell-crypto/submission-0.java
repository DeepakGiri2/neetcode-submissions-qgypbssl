class Solution {
    public int maxProfit(int[] prices) {
        int maxprofits = 0;
        int lessprice = prices[0];
        for(int i : prices)
        {
            if(i < lessprice)
            {
                lessprice = i;
            }
            maxprofits = Math.max(maxprofits,i-lessprice);
        }
        return maxprofits;
    }
}
