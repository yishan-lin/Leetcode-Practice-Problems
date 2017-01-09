/*Implement a method to perform basic string compression using the counts of repeated character.  
 * If the “compressed” string would not become smaller than the original string, your method should return 
 * the original string.*/

import java.util.Hashtable;

public class StringCompression {
    
    static void stringcompression(String string) {
        
        char[] stringarray = string.toCharArray();
        
        int count = 1;
        
        char comparison = stringarray[0];
        
        for (int x = 1; x < stringarray.length; x++) {
            
            System.out.println("char = " + stringarray[x] + " @ index of " + x);
            
            if (comparison != stringarray[x]) {
                
                if (x == stringarray.length - 1) {
                    
                    count = 1;
                    System.err.println("***REACHED THE END***");
                    System.err.println("Stored final char " + stringarray[x] + " with " + count);
                    
                }
                
                System.err.println("Storing " + comparison + ", # of times seen in a row: " + count);
                
                //resetting the count and the comparison array as it keeps going
                comparison = stringarray[x];
                count = 1;
                continue;
                
            }
            
            else {
                
                System.out.println("same character as before " + stringarray[x] + " so adding to its count");
                count += 1;
                
                if (x == stringarray.length - 1) {

                    System.err.println("***REACHED the end***");
                    System.err.println("Stored final char " + comparison + " with " + count);
                    
                    
                }
                
            }
            
            //to cover last case where element in array, reached the end 
            
            
        }
        
    }
    
    public static void main(String[] args) {
        
        String string = "aabcccccaaa";
        System.err.println("Should print out: a2b1c5a3");
        
        stringcompression(string);
        
        //aa
        //b
        //ccccc
        //aaa
        
    }
    
}