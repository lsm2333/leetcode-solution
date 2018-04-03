package simon.leetcode.p122;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * @author lsm2333
 *
 */
public class BestTimeToBuyAndSellStock2 {
	public static void main(String[] args){
		SolutionP122.maxProfit(new int[]{2,2,2,5});
	}
}

class SolutionP122 {
    public static int maxProfit(int[] prices) {
        int total = 0;
        int max = 0;
        int min = 0;
        boolean isBought = false;
        if(prices.length<2){
        	System.out.printf("Best benefit:0%n");
        	return 0;
        }
        if(prices.length==2 && prices[0]<prices[1] ){
        	System.out.printf("Best benefit:%d%n", prices[1]-prices[0]);
        	return prices[1]-prices[0];
        }
        if(prices[0]<prices[1]){
            isBought = true;
            min = prices[0];
            System.out.printf("Add %d to min%n", prices[0]);
        }
        for(int i=2;i<prices.length;i++) {
            if(prices[i-2]<prices[i-1] && prices[i-1]>prices[i] && isBought){
                max += prices[i-1];
                System.out.printf("Add %d to max%n", prices[i-1]);
                isBought = false;
            }else if(prices[i-2]>prices[i-1] && prices[i-1]<prices[i] && !isBought){
                min += prices[i-1];
                System.out.printf("Add %d to min%n", prices[i-1]);
                isBought = true;
            }
            if(isBought && i==prices.length-1){
                max += prices[i];
                System.out.printf("Add %d to max%n", prices[i]);
                isBought = false;
            }
        }
        total = max - min;
        System.out.printf("Best benefit:%d%n", total);
        return total;
    }
}