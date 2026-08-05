class Solution {
    public int maxProfit(int[] prices) {
        
        int i=prices.length-2;
        int j=prices.length-1;
        int max=0;
        while(i>=0){
            if(prices[i]>prices[j]){
                j=i;
            }
            else{
                int profit=prices[j]-prices[i];
                max=Math.max(max,profit);

            }
            i--;
           
            }
        
        return max;
    }
}