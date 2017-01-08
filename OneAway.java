/*There are three types of edits that can be peformed on string, insert, remove a character, or replace a character. Write a function to check if they are one 
 * or zero edits away.*/

import java.util.Hashtable;

public class OneAway {
    
    static boolean oneaway(String ideal, String current) {
        
        System.out.println("IDEAL LENGTH = " + ideal.length());
        System.out.println("CURRENT LENGTH = " + current.length());
        
        //if the length are the same, check if they need replacing
        if (ideal.length() == current.length()) {
            return replacecheck(ideal, current);
            
        }
        //check if it is insert
        else if (ideal.length() == current.length() + 1) {
            return insertcheck(ideal, current);
        }
        //check if it is delete
        else if (ideal.length() == current.length() - 1) {
            return insertcheck(ideal, current);
        }
        
        return false;
    }
    
    static boolean replacecheck(String ideal, String current) {
        
        char[] idealarray = ideal.toCharArray();
        char[] currentarray = current.toCharArray();
 
        boolean found1stdifference = false;
        
        for (int x = 0; x < idealarray.length; x++) {
            
            if (idealarray[x] != currentarray[x]) {

                if (found1stdifference) {
                 
                    return false;
                    
                }
                
                found1stdifference = true;
                continue;
                
            }
            
        }
        
        return true;
    }
    
    static boolean insertcheck(String ideal, String current) {
        
        char[] idealarray = ideal.toCharArray();
        char[] currentarray = current.toCharArray();
        
        int x = 0;
        int y = 0;
        
        while (x < ideal.length() && y < current.length()) {
         
            System.out.println(idealarray[x] + " VS " + currentarray[y]);
            
            if (idealarray[x] != currentarray[y]) {
                
                if (x != y) {
                    return false;
                }
                
                x+= 1;
                
            }
            
            else {
            
            x +=1;
            y += 1;
            
            }
        }
        
        return true;
        
    }
    

    public static void main(String[] args) {
        
        String ideal = "hale";
        String current = "hales";
        
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
 
 
 /* Hashtable<Character, Integer> ideal_table = new Hashtable<Character, Integer>();
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
 
 boolean checknextone = false;
 
 for (char z: currentarray) {
 
 System.err.println("COMPARING " + z + " WITH " + ideal_table.containsKey(z));
 
 //ONEDELETE away, when all keys contained, current is greater than ideal by 1, the key frequency in current is greater than ideal
 
 if ((ideal_table.containsKey(z) && (currentarray.length == idealarray.length + 1) && (current_table.get(z) - ideal_table.get(z) == 1))) {
 
 System.err.println("ONE DELETE AWAY, EXTRA EXISTING CHAR");
 
 return true;
 
 }
 
 //ONEDELETE away, when all keys contained, currently is greather than ideal by 1, but this extra char is NOT of existing ideal
 else if (!(ideal_table.containsKey(z)) && (currentarray.length == idealarray.length + 1)) {
 
 System.err.println("ONE DELETE AWAY, EXTRA CHAR NOT SEEN BEFORE");
 
 return true;
 
 }
 
 //ONEINSERT away, when all keys contained, but currenty is SHORT by ideal by one
 else if (ideal_table.containsKey(z) && (currentarray.length == idealarray.length - 1)) {
 
 System.err.println("ONE INSERT AWAY");
 
 return true;
 
 }
 
 //ONE REPLACE away, where ideal is missing one key in current
 else if (!(ideal_table.containsKey(z) && idealarray.length == currentarray.length)) {
 
 if (checknextone) { //because if this is true that means there are TWO keys/chars that don't match, which means it costs more than one
 
 return false;
 
 }
 
 checknextone = true;
 continue;
 }
 
 }*/



