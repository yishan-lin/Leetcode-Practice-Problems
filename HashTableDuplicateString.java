import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;

public class HashTableDuplicateString {
    
    public static void duplicate(String x) {
        
        Hashtable<Character, Integer>duplicate = new Hashtable<Character, Integer>();
        
        char[] chararray = new char[x.length()];
        
        chararray = x.toCharArray();
        
        for (int count = 0; count < chararray.length; count++) {
            
            //for debug purposes
            //System.out.println(chararray[count]);
            
            if (duplicate.containsKey(chararray[count])) {
                
                duplicate.put(chararray[count], duplicate.get(chararray[count]) + 1);
                
            }
            
            else {
                
                duplicate.put(chararray[count], 1);
                
            }
            
        }
        
        //Enumeration hashtablekeys = duplicate.keys();
        //Enumeration hashtablevalues = duplicate.elements();
        
        Set<Character> characterset = duplicate.keySet();
        
        System.out.println("Found duplicates in " + x);
        
        for (Character c : characterset) {
            
            if (duplicate.get(c) > 1) {
                
                System.out.println((c) + " : " + duplicate.get(c));
                
            }
            
            else {
                
                continue;
                
            }
            
        }
        
       /* while (hashtablekeys.hasMoreElements()) { //main traversal of hash table keys
            
            //Character keycomparison = hashtablekeys.nextElement();
            
            if (duplicate.get(hashtablekeys.nextElement()) > 1) {
                
                System.out.println("DUPLICATE SPOTTED! = ");
                
            }
            
            else {
                
                continue;
                
            }
            
        }*/
        
        /* if (duplicate.get(chararray[count]) > 1) {
         * 
         System.out.println("Here are the duplicate characters in a String = " + chararray[count]);
         
         }*/
        
    }
    
    public static void main(String[] args) {
        
        duplicate("Javahelloiamhavingfun");
        
    }
    
}