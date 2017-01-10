import java.util.Hashtable;

public class CAIT {
    
    static String[] findPotentialInsiderTraders(String[] datafeed) {
        
        Hashtable<Integer, Integer> stockprice = new Hashtable<Integer, Integer>();
     
        //printing out the 
        /*System.err.println("***Printing out data array.***");
        for (String x: datafeed) {

            System.err.println(x);
            
        }*/
        
        System.out.println();
        System.err.println("***After Parsing String***");
        
         for (int x = 0; x < datafeed.length; x++) {
             
            if (datafeed[x].length() == 4) {
              
                System.err.println("This is a stock price.");
                
                 String[] datafeedsplit = datafeed[x].trim().split("\\|");
                 
                 System.err.println("datafeedsplit[0] = " + datafeedsplit[0]);
                 System.err.println("datafeedsplit[1] = " + datafeedsplit[1]);
                 
                 
                 
                 
                for (String y: datafeedsplit) {
                    
                    System.out.println(y);
                    
                    
                }
                
            }
            
            else {
                
                System.err.println("This is a transaction.");
                
            }
            
            
            
            String[] datafeedsplit = datafeed[x].trim().split("\\|");
            
            for (String y: datafeedsplit) {
                
                System.out.println(y);
                
            }
            
            System.out.println("");
            
        }
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
        String[] datafeed = {"0|20", "0|Kristi|SELL|3000", "0|Will|BUY|5000", "0|Tom|BUY|5000", "0|Shilpa|BUY|1500","1|Tom|BUY|1500000","3|25","5|Shilpa|SELL|1500"}; 
        
        findPotentialInsiderTraders(datafeed);
        
    }
    
}

