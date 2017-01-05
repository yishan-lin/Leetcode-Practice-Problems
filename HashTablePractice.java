import java.util.Hashtable;

public class HashTablePractice {
 
    public static void main(String[] args) {
     
    Hashtable practice = new Hashtable();
    
    practice.put("Apple", "Cupertino");
    
    System.out.println("Does the hashtable contain Apple (should be true) = " + practice.containsKey("Apple"));
    System.out.println("Does the hashtable contain Google (should be false) = " + practice.containsKey("Google"));
    System.out.println("Does the hashtable contain the VALUE of Coop = " + practice.containsValue("Cupertino"));
    
    }
    
    
}