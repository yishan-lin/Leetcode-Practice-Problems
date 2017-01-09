//takes N as height and prints a staircase

public class Staircase {
    
    static void staircaseprint(int height) {
        
        for (int x = 0; x <= height; x++) {
            
            for (int y = 1; y <= x; y++) {
                
                System.out.print("#");

            }
            
           System.out.println(""); 
        }
    }
    
    public static void main(String[] args) {
        
        int x = 7;
        
        staircaseprint(x);
        
    }
    
}