package com.latitude.stockprices;

import static com.latitude.stockprices.StockPricesCounter.getMaxProfit;
import static com.latitude.stockprices.StockPricesCounter.stockPricesToPrint;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

  @Test
  public void challengeExample() {
    int[] stockPrices = { 10, 7, 5, 8, 11, 9 };
    assertEquals(6, getMaxProfit(stockPrices));
  }

  @Test
  public void youCanNotBuyAndSellInTheSameTime() {
    int[] stockPrices = { 10 };
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      getMaxProfit(stockPrices);
    });
  }
  
  @Test
  public void priceMustBePositive() {
    int[] stockPrices = { 10, 7, 5, 8, 11, -1 };
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      getMaxProfit(stockPrices);
    });
  }

  @Test
  public void hanldeTwoPrices() {
    int[] stockPrices = { 0, 30 };
    assertEquals(30, getMaxProfit(stockPrices));
  }

  @Test
  public void noPositiveTrades() {
    int[] stockPrices = { 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0, getMaxProfit(stockPrices));
  }

  @Test
  public void checkOutputString() {
    int[] stockPrices = { 10, 7, 5, 8, 11, 9 };
    assertEquals("10, 7, 5, 8, 11, 9", stockPricesToPrint(stockPrices));
  }
}
