public class URLify {
    
    public static void replacewhitespace_brutemethod(String s) {
        
        int count = 0;
        
        char[] modified_string = s.toCharArray();
        //System.out.println(modified_string.length);
        
        while (count < modified_string.length) {
            
            if ((int)modified_string[count] == 32) {
                
                //System.out.println("MUST BE WHITESPACE! = " + modified_string[count]);
                modified_string[count] = '%';
                
            }
            
            else {
             
                //System.out.println("MUST BE OTHER CHAR = " + modified_string[count]);
                
            }
            
            count++;
            
        }
        
        System.out.println(String.valueOf(modified_string));
    }
    
    public static String replacewhitespace(String s) {
     
        s = s.replace(" ", "%20");
        return s;
        
    }
    
    public static void main(String[] args) {
        
        String jones_smith = "Ms Jones Smith ";
        replacewhitespace_brutemethod(jones_smith);
        
        System.out.println(replacewhitespace(jones_smith));
        
    }
    
}