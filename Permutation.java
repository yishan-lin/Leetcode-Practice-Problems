/*check if two strings are permutations, so dog == god ==> true*/

import java.util.Arrays;
import java.util.Hashtable;

public class Permutation {
    
    static boolean permutation(String stringone, String stringtwo) {
     
        if (stringone.length() != stringtwo.length()) {
            return false;
        }
        
        else {
        
        Hashtable<Character, Integer> permutationcheck = new Hashtable<Character, Integer>(); 
        
        char[] chararrayone = stringone.toCharArray();
        
            for (char x : chararrayone) {
             
                if (permutationcheck.containsKey(x)) {
                 
                    permutationcheck.put(x, 1 + permutationcheck.get(x));
                    
                }
                
                else {
                    
                    permutationcheck.put(x, 1);
                    
                }

            }
          
         char[] chararraytwo = stringtwo.toCharArray();
         
            for (char y: chararraytwo) {
             
                if (!permutationcheck.containsKey(y)) {
                    
                    return false;
                    
                }
                
                else {
                    
                    continue;
                    
                }
                
            }
            
        }
        
        return true;
        
    }
    
    public static void main(String[] args) {
        
        String stringone = "samaltman";
        String stringtwo = "namtalsam";
        
        System.out.println(permutation(stringone, stringtwo));
        
        
    }
    
}