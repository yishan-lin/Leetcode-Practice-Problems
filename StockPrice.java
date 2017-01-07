/*Suppose we could access yesterday's stock prices as a list, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stock_prices_yesterday[60] = 500.

Write an efficient function that takes stock_prices_yesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

For example:

  stock_prices_yesterday = [10, 7, 5, 8, 11, 9]

get_max_profit(stock_prices_yesterday)
# returns 6 (buying for $5 and selling for $11)

No "shorting"Ñyou must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).*/

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;

public class StockPrice {
    
    static void get_max_profit(int[] stock_prices_yesterday) {
     
        Hashtable<Integer, Integer> stockprices = new Hashtable<Integer, Integer>();
        
        int index = 0;
        
        for (int x : stock_prices_yesterday) {
         
            stockprices.put(x, index);
            
            index += 1;
            
        }
        
        Enumeration stock_price = stockprices.keys();
        
        
    }
    
    public static void main(String[] args) {
        
        int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
        
        get_max_profit(stock_prices_yesterday);
        
    }
    
}