package easyProblems;

public class BestTimeToBuyAndSellStock {
  public static void main(String args[]) {
    final long startTime = System.nanoTime();
    // Do something
    BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();
    int[] prices = { 1, 2 };
    System.out.println(bt.maxProfit(prices));
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }

  public int maxProfit(int[] prices) {
    int buyPrice = prices[0];
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice > prices[i]) {
        buyPrice = prices[i];
      } else {
        if (prices[i] - buyPrice > profit) {
          profit = prices[i] - buyPrice;
        }
      }
    }
    return profit;
  }
}
