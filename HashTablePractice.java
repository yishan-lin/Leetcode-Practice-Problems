import java.util.Hashtable;
import java.util.Enumeration;

public class HashTablePractice {
    
    public static void main(String[] args) {
        
        Hashtable<String, String> companies = new Hashtable<String, String>();
        
        Enumeration iterator;
        Enumeration valueiterator;

        companies.put("Apple", "Cupertino");
        companies.put("Uber", "San Francisco");
        companies.put("Oracle", "Redwood City");
                        
        iterator = companies.keys();
        valueiterator = companies.elements();

        System.out.println("should be true = " + companies.containsKey("Apple"));
        System.out.println("should be false = " + companies.containsValue("Saratoga"));
        
       System.out.println("should be true if element = " + iterator.hasMoreElements());
       
       while (iterator.hasMoreElements()) {
        
           System.out.println(iterator.nextElement() + " : " + valueiterator.nextElement());
           
       }
        
        
    }
    
}