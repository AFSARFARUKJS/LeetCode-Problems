class Solution {
    public int[] finalPrices(int[] prices) {
        int le= prices.length;
        for(int i=0;i<le;i++){
            for(int j=i+1;j<le;j++){
                if(prices[i]>=prices[j]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
