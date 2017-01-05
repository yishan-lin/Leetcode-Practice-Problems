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
        
        System.out.println("is hashtable empty = " + companies.isEmpty());
        
        while (iterator.hasMoreElements()) {
            
            System.out.println(iterator.nextElement() + " : " + valueiterator.nextElement());
            
        }
        
        System.out.println("is hashtable empty = " + companies.isEmpty());
        System.out.println("hashtable size = " + companies.size());
        
        System.out.println(companies.get("Apple"));
        System.out.println(companies.get("Cupertino"));
        
    }
    
}