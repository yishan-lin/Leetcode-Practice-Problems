/*Given a string, write a function to check if it is a permutation of a palindrome.  A palindrome is the same forwards/backwards.  
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.*/

import java.util.Hashtable;

public class PalindromePermutation {
    
    static boolean palindromepermutation(String input, String comparison) {
        
        Hashtable<Character, Integer> input_table = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> comparison_table = new Hashtable<Character, Integer>();
        
        char[] inputarray = input.toCharArray();
        
        for (char x : inputarray) {
         
            if (input_table.containsKey(x)) {
             
                input_table.put(x, 1 + input_table.get(x));
                
            }
            
            else {
                
                input_table.put(x, 1);
                
            }
            
        }
        
        char[] comparisonarray = comparison.toCharArray();
        
           for (char x : comparisonarray) {
         
            if (comparison_table.containsKey(x)) {
             
                comparison_table.put(x, 1 + comparison_table.get(x));
                
            }
            
            else {
                
                comparison_table.put(x, 1);
                
            }
            
        }
           
        
        for (char x: inputarray) {
         
            if (!(comparison_table.containsKey(x)) || comparison_table.get(x) != input_table.get(x)) {
                
                return false;
            }
          
        }
        
        return true;
         
    }
    
    public static void main(String[] args) {
        
        String input = "tact coa";
        String comparison = "taco ca";
        
        System.out.println(palindromepermutation(input, comparison));
        
        
    }
    
}