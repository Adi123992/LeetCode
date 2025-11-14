package Arrays;

class Solution1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minCost = prices[0];
        //days iteration
        for(int i = 0 ; i < prices.length ; i++){
            int todayProfit = prices[i] - minCost;
            if(prices[i] < minCost) minCost = prices[i];
            if(todayProfit > profit){
                profit = todayProfit;
            }
        }
        return profit;
    }
}
public class BestTimeToSellAStock {
    public static void main(String[] args) {
        int[] arr = { 7, 1 , 4, 8 , 2 };
        Solution1 s = new Solution1();
        System.out.println(s.maxProfit(arr));
    }
}
