package com.latitude.stockprices;

/**
 * Stock Prices exercise.
 * Solution is implemented on the assumption that stock prices are positive integers.
 */
public class StockPricesCounter {
  /**
   * Gets the max profit.
   *
   * @param stockPrices the generated stock prices array
   * @return the max profit
   */
  public static int getMaxProfit(int[] stockPrices) {
    validateStockPrices(stockPrices);

    int maxProfit = 0;
    int minElement = stockPrices[0];

    for (int stockPrice : stockPrices) {
      validatePriceIsPositive(stockPrice);
      
      maxProfit = Math.max(maxProfit, (stockPrice - minElement));
      minElement = Math.min(minElement, stockPrice);
    }

    return maxProfit;
  }

  /**
   * Stock prices to print.
   *
   * @param stockPrices the stock prices
   * @return the string
   */
  public static String stockPricesToPrint(int[] stockPrices) {
    StringBuilder sb = new StringBuilder();

    for (int stockPrice : stockPrices) {
      sb.append(stockPrice);
      sb.append(", ");
    }

    sb.setLength(sb.length() - 2);

    return sb.toString();
  }
  
  /**
   * Validate stock prices.
   *
   * @param stockPrices the stock prices
   * @throws IllegalArgumentException the illegal argument exception
   */
  private static void validateStockPrices(int[] stockPrices) throws IllegalArgumentException {
    if (stockPrices.length < 2) {
      throw new IllegalArgumentException("Stock prices array must have more than 1 element");
    }
  }
  
  private static void validatePriceIsPositive(int stockPrice) throws IllegalArgumentException {
    if (stockPrice < 0) {
      throw new IllegalArgumentException("Stock prise can not be nagative");
    }
  }
}
