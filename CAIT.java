public class CAIT {
    
    static String[] findPotentialInsiderTraders(String[] datafeed) {
     
        //printing out the 
        System.err.println("Printing out data array.");
        for (String x: datafeed) {

            System.out.println(x);
            System.out.println(x.split("|"));
            
        }
        
        return null;
        
    }
    
    public static void main(String[] args) {
        
        String[] datafeed = {"0|20", "0|Kristi|SELL|3000", "0|Will|BUY|5000", "0|Tom|BUY|5000", "0|Shilpa|BUY|1500","1|Tom|BUY|1500000","3|25","5|Shilpa|SELL|1500"}; 
        
        findPotentialInsiderTraders(datafeed);
        
    }
    
}

