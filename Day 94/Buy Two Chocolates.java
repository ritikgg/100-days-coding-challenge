class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int copyMoney = money;
        copyMoney = copyMoney - (prices[0] + prices[1]); 
        if(copyMoney >= 0){
            return copyMoney;
        }
        return money;
    }
}
