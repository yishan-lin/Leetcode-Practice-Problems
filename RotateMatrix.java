public class RotateMatrix {
    
    
    
    public static void main(String[] args) {
        
        String[][] matrix = { {"A","B","C","D"}, {"E","F","G","H"},{"J","K","L","M"}, {"N","O","P","Q"} };
        
        //Traversal of matrix to print out all for reference
        System.err.println("Traversal of matrix");
        
        for (int x = 0; x < matrix.length; x++) {
            
            for (int y = 0; y < matrix[x].length; y++) {
                
                System.out.print(matrix[x][y]);
                
            }
            
            System.out.println("");
            
        }
        
        int first = 0;
        
        System.err.println("**CORNERS**");
        System.err.println(matrix[0][0] + " swap with " + matrix[0][3]);
        System.err.println(matrix[3][0] + " swap with " + matrix[3][3]);
        
        System.err.println("**INNERS 1**");
        System.err.println(matrix[0][1] + " swap with " + (matrix[1][3]));
        System.err.println(matrix[3][1] + " swap with " + (matrix[1][0]));
        
        System.err.println("**INNERS 2**");
        System.err.println(matrix[0][2] + " swap with " + matrix[2][3]);
        System.err.println(matrix[3][2] + " swap with " + matrix[2][0]);
        
        System.err.println("test of method");
        for (int x = 0; x < matrix.length; x++) {
            
            String top = matrix[first][x];
            System.out.println("top = " + top);

            String rightcorner = matrix[x][matrix.length - 1];
            System.err.println("swap with = " + rightcorner);
            
        }
        
        
        
        
        //System.out.println("matrix length = " + matrix.length);
        //System.out.println("matrix within array length = " + matrix[0].length);
        
    }
    
}