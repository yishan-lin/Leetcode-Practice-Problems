public class RotateMatrix {
    
    
    
    public static void main(String[] args) {
        
        String[][] matrix = { {"A","B","C","D"}, {"E","F","G","H"},{"J","K","L","M"}, {"N","O","P","Q"} };
        
        int count = 0;
        
        for (int x = 0; x < matrix.length; x++) {
            
            for (int y = 0; y < matrix[x].length; y++) {
             
                //System.out.println(matrix[x]);
                System.out.print(matrix[x][y]);
                
            }
            
            System.out.println("");
            
        }
        
        //System.out.println(matrix[0]);
        //System.out.println(matrix[1]);
        //System.out.println(matrix[2]);
        //System.out.println(matrix[3]);
        //System.out.println(matrix[4]);
        
    }
    
}