/*Implement an algo to see if String has all unique characters*/

import java.util.Hashtable;

public class isUnique {
    
    static boolean isUnique(String string) {
     
        char[] chararray = string.toCharArray();
        
        Hashtable<Character, Boolean> duplicate = new Hashtable<Character, Boolean>();
        
        for (int x = 0; x < chararray.length; x++) {
         
            //System.out.println("PRINT = " + chararray[x]);
            
            if (duplicate.containsKey(chararray[x])) {
                
                System.out.println("Duplicate spotted of " + chararray[x] + "!");
                return false;
                
            }
            
            else {
               
                duplicate.put(chararray[x], true);
                
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        String string = "isthisaunique";
        System.out.println(isUnique(string));
    }
    
}