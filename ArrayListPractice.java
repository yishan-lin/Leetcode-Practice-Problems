import java.util.ArrayList;

public class ArrayListPractice {
    
    public static void main(String[] args) {
        
        ArrayList<String> companies = new ArrayList<String>();
        
        companies.add("Apple");
        companies.add("Uber");
        companies.add("Thumbtack");
        companies.add("Munchery");
        companies.add("DoorDash");
        
        System.out.println(companies.get(0));
        
        System.out.println(companies.contains("Facebook"));
        
        companies.add(2, "Amazon");
        
        companies.add(1, "Google");
        
        companies.add(0, "Heyo");
        
        companies.remove("Heyo");
        
        System.out.println(companies.get(0));
        
        System.out.println(companies.indexOf("Google"));
        
        System.out.println(companies.indexOf("yahoo"));
        
        System.out.println(companies.remove("Yahoo"));
        
        //System.out.println(companies.get(1000));
        
        System.out.println("print all = " + companies);
        System.out.println("size of arraylist = " + companies.size());
        System.out.println("contains Google should be true = " + companies.contains("Google"));
    }
    
}