/*There are three types of edits that can be peformed on string, insert, remove a character, or replace a character. Write a function to check if they are one 
 * or zero edits away.*/

import java.util.Hashtable;

public class OneAway {
    
    static boolean oneaway(String ideal, String current) {
        
        
        Hashtable<Character, Integer> ideal_table = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> current_table = new Hashtable<Character, Integer>();
        
        char[] idealarray = ideal.toCharArray();
        char[] currentarray = current.toCharArray();
        
        for (char x : idealarray) {
            
            if (ideal_table.containsKey(x)) {
                
                ideal_table.put(x, 1 + ideal_table.get(x));
            }
            
            else {
                
                ideal_table.put(x, 1);
                
            }
            
        }
        
        for (char y: currentarray) {
            
            if (current_table.containsKey(y)) {
                
                current_table.put(y, 1 + current_table.get(y));
                
            }
            
            else {
                
                current_table.put(y, 1);
                
            }
            
        }
        
        //remove a character, when current array is longer than ideal +1, remove when EXTRA character of same OR when EXTRA character is not of same
        
        for (char z: idealarray) {
            
            if ((current_table.containsKey(z) && (currentarray.length == idealarray.length + 1) && (current_table.get(z) > ideal_table.get(z)))) {
                
                return true;
                
            }

        }
        
        return false;
    }
    
    
    public static void main(String[] args) {
        
        String ideal = "pales";
        String current = "paless";
        
        System.err.println("COMPARING " + ideal + " WITH " + current);
        System.out.println(oneaway(ideal, current));
        
    }
    
}

/*
 /* for (char x: idealarray) {
 
 System.out.println("COMPARING " + x + " OF IDEAL ARRAY" + current_table.containsKey(x));
 
 //the current array has everything and is EXTRA one => needs REMOVE
 if ((current_table.containsKey(x)) && (current_table.get(x) == ideal (idealarray.length + 1 == currentarray.length)) {
 
 System.out.println("edge case 1");
 return true;
 }
 
 //currenty array is missing char from ideal array but has SAME length => needs REPLACE
 
 else if (!(current_table.containsKey(x)) && (idealarray.length == currentarray.length)) {
 System.out.println("edge case 2");
 return true;
 }
 
 //needs insert
 else if ((idealarray.length == currentarray.length - 1) && current_
 
 //needs REMOVE, current array has extra
 /* else if (current_table.containsKey(x) && (current_table.get(x) == ideal_table.get(x)) &&  (currentarray.length == idealarray.length + 1)) {
 System.out.println("edge case 3");
 return true;
 
 }*/

