import java.util.Hashtable;
import java.util.Set;
import java.util.Enumeration;

public class HashTableDuplicateString {
    
    //find duplicate in a string
    
    static void duplicate_char(String string) {
     
        Hashtable<Character, Integer>duplicate = new Hashtable<Character, Integer>();
        
        char[] char_array = new char[string.length()];
            
        char_array = string.toCharArray();
        
        for (int x = 0; x < char_array.length; x++) {
         
            //System.out.println("chararray[x] = " + char_array[x]);
            
            if (duplicate.containsKey(char_array[x])) {
                
                duplicate.put(char_array[x], 1 + duplicate.get(char_array[x]));
            
            }
            
            else {
             
                duplicate.put(char_array[x], 1);
                
            }
            
        }
        
        Set<Character> duplicate_char_keys = duplicate.keySet();
        
        System.out.println("All duplicates in String " + string);
        
        for (char y : duplicate_char_keys) {
            
            if (duplicate.get(y) > 1) {
                
                System.out.println("Char: " + y + " Count: " + duplicate.get(y));
                
            }
            
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        duplicate_char("Yoyoyoyoyo");
        
    }
    
}