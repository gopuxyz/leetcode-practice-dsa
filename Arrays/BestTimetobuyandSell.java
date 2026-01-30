public class BestTimetobuyandSell {
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
         System.out.println(max_profit(prices));
    }

    public static int max_profit(int prices[]){
        int n = prices.length;
        int maxprofit = 0;
        int buy_price = prices[0];
        for(int i = 1; i<n; i++){
            int curr_profit = prices[i] - buy_price;
            if(curr_profit > maxprofit){
                maxprofit = curr_profit;
            }
            if(prices[i]<buy_price){
                buy_price = prices[i];

            }
        }
        return maxprofit;
    }

    
}
