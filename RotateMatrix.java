public class RotateMatrix {
    
    
    
    public static void main(String[] args) {
        
        String[][] matrix = { {"A","B","C","D"}, {"E","F","G","H"},{"I","J","K","L"}, {"M","N","O","P"} };
        
        //Traversal of matrix to print out all for reference
        System.err.println("Traversal of matrix");
        
        for (int x = 0; x < matrix.length; x++) {
            
            for (int y = 0; y < matrix[x].length; y++) {
                
                System.out.print(matrix[x][y]);
                
            }
            
            System.out.println("");
            
        }
        
        int first = 0;
        
        /*System.err.println("**CORNERS**");
        System.err.println(matrix[0][0] + "  => " + matrix[0][3]);
        System.err.println(matrix[0][3] + "  => " + matrix[3][3]);
        System.err.println(matrix[3][3] + "  => " + matrix[3][0]);
        System.err.println(matrix[3][0] + "  => " + matrix[0][0]);
        
        System.err.println("**INNERS 1**");
        System.err.println(matrix[0][1] + "  => " + (matrix[1][3]));
        System.err.println(matrix[1][3] + "  => " + (matrix[1][3]));
        System.err.println(matrix[3][1] + "  => " + (matrix[1][0]));
        
        System.err.println("**INNERS 2**");
        System.err.println(matrix[0][2] + "  => " + matrix[2][3]);
        System.err.println(matrix[3][2] + "  => " + matrix[2][0]);*/
        
        System.out.println("!!!test of method!!!");
        
        int last = matrix.length-1;
        
        int x = 0;
        
        //for (int x = 0; x < matrix.length; x++) {
            
            String topleft = matrix[first][x];

            String topright = matrix[first][last];
            
            String botleft = matrix[last][x];
            
            String botright = matrix[last][last];
            
            String temp = topleft;
            topleft = botleft;
            botleft = botright;
            botright = topright;
            topright = temp;
            
            System.out.println("topleft = " + topleft + "topright = " + topright + "botright = " + botright + "botleft = " + botleft);
            
         
            
        //}
        
        
        
        
        //System.out.println("matrix length = " + matrix.length);
        //System.out.println("matrix within array length = " + matrix[0].length);
        
    }
    
}