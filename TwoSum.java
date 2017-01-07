import java.util.Hashtable;

public class TwoSum {
    
    public static int[] twosum(int[] array, int target) {
        
        Hashtable<Integer, Integer> twosumcheck = new Hashtable<Integer, Integer>();
        
        int[] solution = new int[2];
        int index = 0;
        
        for (int x = 0; x < array.length; x++) {
            
            if (twosumcheck.containsKey(target - array[x])) {
                
                solution[0] = x;
                System.out.println("solution[0] = " + (x));
                solution[1] = twosumcheck.get(target - array[x]);
                System.out.println("solution[1] = " + twosumcheck.get(target - array[x]));
                
                return solution;
                
            }
            
            twosumcheck.put(array[x], x + index);
            index++;
        }
        
        
        return solution;
        
    }
    
    public static void main (String[] args) {
        
        int[] array = {2, 7, 11, 15};
        
        System.out.println("solution = " + twosum(array, 9));
        
    }
    
}