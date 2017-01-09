import java.util.Hashtable;

public class StringCompression {
    
    static void stringcompression(String string) {
       
        char[] stringarray = string.toCharArray();
        
        for (int x = 0; x < stringarray.length; x++) {
         
            System.out.println("char = " + x);
            
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        String string = "aabcccccaaa";
        System.err.println("Should print out: a2b1c5a3");
        
        //aa
        //b
        //ccccc
        //aaa
        
    }
    
}