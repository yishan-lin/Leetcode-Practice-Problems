public class ReverseString {
 
    static void swap(String string) {
     
        char[] chararray = string.toCharArray();
        
        int x = 0;
        int y = 1;
        
        while (x != chararray.length-y) {
            
            //System.out.println("x = " + x);
            //System.out.println("y = " + y);
         
            char temp = chararray[x];
            chararray[x] = chararray[chararray.length - y];
            chararray[chararray.length - y] = temp;
            
            x++;
            y++;
            
        }
        
        System.out.println(new String (chararray));
        
    }
    
    public static void main(String[] args) {
        
        swap("hello");
        
    }
    
}