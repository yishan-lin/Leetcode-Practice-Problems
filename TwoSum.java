public class TwoSum {
    
    public static int[] twosum(int[] array, int target) {
        
        for (int x = 0; x < array.length; x++) {
            for (int y = x + 1; y < array.length; y++) {
                
                int diff = target - array[x];
                
                if (array[y] == diff) {
                    int[] solution = {x, y};
                    System.err.println("x = " + x);
                    System.err.println("y = " + y);
                    return solution;
                }
                
            }
            
        }
        
        return null;
        
    }
    
    public static void main (String[] args) {
        
        int[] array = {2, 7, 11, 15};
        
        System.out.println("solution = " + twosum(array, 9));
        
    }
    
}