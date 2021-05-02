package com.latitude.stockprices;

/**
 * The Class Application.
 */
public class Application {
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    int[] stockPrices = {1, 2, 10, 15, 13, 6, 8, 16, 0, 3};

    int maxProfit = StockPricesCounter.getMaxProfit(stockPrices);

    System.out.println(StockPricesCounter.stockPricesToPrint(stockPrices));
    System.out.println(maxProfit);
  }
}
