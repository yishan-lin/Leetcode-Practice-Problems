public class ZeroMatrix {
    
    static void display(int[][] zeromatrix) {
     
        for (int x = 0; x < zeromatrix.length; x++) {
         
            for (int  y = 0; y < zeromatrix[x].length; y++) {
             
                if (y == zeromatrix[x].length - 1) {
                 
                    System.err.print(zeromatrix[x][y]);
                    
                }
                
                else {
                
                System.err.print(zeromatrix[x][y] + ",");
                
                }
                
            }
            
            System.out.println("");
            
        }
        
    }

    static int[][] findzero(int[][] zeromatrix) {
     
        for (int x = 0; x < zeromatrix.length; x++) {
            
            for (int y = 0; y < zeromatrix[x].length; y++) {
                
                if (zeromatrix[x][y] == 0) {
                    
                    System.out.println("Zero found in matrix @ row " + x + " column " + y);
                    
                    int foundindex[] = {x, y};
                    
                    return resetzeros(foundindex, zeromatrix);
                    
                }
                
            }
            
        }
        
        return null;
    }
    
    static int[][] resetzeros(int[] foundindex, int[][] zeromatrix) {
        
        System.out.println("ROW = " + foundindex[0]);
        System.out.println("COLUMN = " + foundindex[1]);
        
        //traversing down ro wfor deletion
        for (int x = 0; x < zeromatrix.length; x++) {
            
            zeromatrix[x][(foundindex[1])] = 0;
         
            if (x == foundindex[0]) {
                
                System.out.println("found row!" + x);
                
                for (int y = 0; y < zeromatrix[x].length; y++) { //traverse down the row
                    
                    zeromatrix[x][y] = 0;
                    
                }
                
            }
            
        }
        
        
        return zeromatrix;
        
    }
        
    public static void main(String[] args) {
        
        int[][] zeromatrix = { {10,11,0,13}, {14,15,16,17}, {18,19,20,21} };
        
        display(zeromatrix);
        display(findzero(zeromatrix));
        
        
    }
    
}