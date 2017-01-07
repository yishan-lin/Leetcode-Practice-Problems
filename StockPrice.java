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
        Enumeration times = stockprices.elements();
        
        Set<Integer> stock_price_ints = stockprices.keySet();
        
        //For debugging purposes
        System.err.println("Enumeration Printing");
        
        while (stock_price.hasMoreElements()) {
         
            System.out.println(stock_price.nextElement() + " : " + times.nextElement());
            
        }
        
        //traversing through hastable, putting keys through keyset, printing out respective values with get()

        System.err.println("Traversal Printing");
        
        for (int key : stock_price_ints) {

            System.out.println((key) + " : " + (stockprices.get(key))) ;
            
        }
        
        //System.err.println("findmax = " + findMax(stock_prices_yesterday, stockprices));
        
    }
    
    static int findMax(int[] stock_prices_yesterday, Hashtable stockprices) {
     
        int maximum = stock_prices_yesterday[0];

        stockprices.get(maximum);
        
       for (int x = 1; x < stock_prices_yesterday.length; x++) {
         
            if ((stock_prices_yesterday[x] > maximum) && (stockprices.get(stock_prices_yesterday[x])) > (stockprices.get(maximum))) {
                
                maximum = stock_prices_yesterday[x];
                System.out.println("MAXIMUM = " + maximum);
                
            }
            
            
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
        
        get_max_profit(stock_prices_yesterday);
        
    }
    
}