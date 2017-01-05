import java.util.Hashtable;

public class HashTableDuplicateString {
    
    public static void duplicate(String x) {
        
       Hashtable<Character, Integer>duplicate = new Hashtable<Character, Integer>();
       
       char[] chararray = new char[x.length()];
       
       chararray = x.toCharArray();
       
        for (int count = 0; count < chararray.length; count++) {
            
            System.out.println(chararray[count]);
        
           if (duplicate.containsKey(chararray[count])) {
               
               duplicate.put(chararray[count], duplicate.get(chararray[count]) + 1);
               
           }
           
           
       }
       
    }
    
    public static void main(String[] args) {
        
        duplicate("yo");
        
    }
    
}