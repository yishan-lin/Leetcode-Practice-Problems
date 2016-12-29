/*Write a function that takes a string as input and returns the string reversed.
 * 
 Example:
 Given s = "hello", return "olleh".*/

import java.util.Arrays;

public class ReverseString {
    
    public static void swap(String s) {
     
        char temp = 'a';
        int x = 0;
        
        while (x < s.length()) {
        
        char temp = s.charAt(x);
        s.charAt(x) = s.charAt(s.length() - x)
        s.charAt(s.length() - x) = temp;    
        System.out.println(x);
        
        x++;
        
        }
    }

    
    public static void main (String[] args) {
        
        String s = "hello";
        swap(s);
        
        
    }
    
}