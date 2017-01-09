//sum array of integers, [1,2,3,4] = 10

public class SumThemAll {
    
    static int sumthemall(int[] intarray) {
        
        int sum = 0;
        
        for (int x : intarray) {
         
            sum = sum + x;
            
        }
        
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        int[] integerarray = {1,2,3,4};
        
        System.out.println(sumthemall(integerarray));
        
    }
    
}