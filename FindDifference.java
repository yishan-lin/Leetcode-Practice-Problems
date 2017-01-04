/*Given two strings s and t which consist of only lowercase letters.
 * 
 String t is generated by random shuffling string s and then add one more letter at a random position.
 
 Find the letter that was added in t.
 
 Example:
 
 Input:
 s = "abcd"
 t = "abcde"
 
 Output:
 e
 
 Explanation:
 'e' is the letter that was added.*/

import java.util.Arrays;

public class FindDifference {
    
    public static char[] spitoriginalchars(String t) {
        
        char[] solution = new char[t.length()];
        
        for (int x = 0; x < t.length(); x++) {
            
            solution[x] = t.charAt(x);
            
            //System.out.println("original char = " + s.charAt(x));
            //return s.charAt(x);
            
        }
        
        /*System.out.println("solution[0] = " + solution[0]);
        System.out.println("solution[1] = " + solution[1]);
        System.out.println("solution[2] = " + solution[2]);
        System.out.println("solution[3] = " + solution[3]);
        System.out.println("solution[4] = " + solution[4]);*/
        
        return solution;
        
    }
    
    public static boolean membertest(char solution, String s) {
        
        for (int x = 0; x < s.length(); x++) {
            
            if (solution == s.charAt(x)) {
                
                //System.out.println("COMPARING " + solution + " WITH " + s.charAt(x));
                return true;
                
            }
        }
        
        return false;
        
    }
    
    public static void find_diff(String t, String s) {
     
        for (int x = 0; x < spitoriginalchars(t).length; x++) {
         
            if (!membertest(spitoriginalchars(t)[x], s)) {
                
                System.out.println("The difference is " + spitoriginalchars(t)[x]);
                
            }
            
            //System.out.println(spitoriginalchars(t)[x]);
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        String s = "abcd";
        String t = "abcde";
        
        spitoriginalchars(t);
        //System.out.println(membertest(spitoriginalchars(t)[0], s));
        
        find_diff(t, s);
        
        //System.out.println(spitoriginalchars(s[0]));
        //membertest(spitoriginalchars(t), s);
        
    }
    
}