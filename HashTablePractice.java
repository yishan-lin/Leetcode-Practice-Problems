import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;

public class HashTablePractice {
    
    public static void main(String[] args) {
        
        Hashtable<String, String> family = new Hashtable<String, String>();
        
        family.put("Yishan", "Lin");
        family.put("Ben", "Anderson");
        family.put("Sean", "Smith");
        family.put("Joe", "Stein");
        family.put("Thomas", "Edison");
        
        Enumeration firstnames = family.keys();
        Enumeration lastnames = family.elements();
        
        while (firstnames.hasMoreElements()) {
            System.out.println(lastnames.nextElement() + ", " + firstnames.nextElement());
        }
        
        System.out.println(family.size());
        System.out.println(family.containsKey("Ben"));
        System.out.println(family.containsValue("Tesla"));
        System.out.println(family.get("Sean"));
        
        Set first_names = family.keySet();
        
        System.out.println("first_names set = " + first_names);
        
        
        
    }
    
}