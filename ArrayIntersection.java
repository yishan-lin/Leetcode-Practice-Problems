public class ArrayIntersection {

    public static int[] intersection(int[] num1, int[] num2) {
        
         int new_array_counter = 0;
         
         int[] intersection_array = new int[10];

        for (int iterator = 0; iterator < num1.length; iterator++) {
            for (int second_iterator = 0; second_iterator < num2.length; second_iterator++) {
             
                System.err.println("NUM1: " + num1[iterator] + " @ iterator = " + iterator);
                System.err.println("NUM2: " + num2[second_iterator] + " @ iterator = " + second_iterator);
                
                if (num1[iterator] == num2[second_iterator]) {
                    intersection_array[new_array_counter] = num1[iterator];
                    System.out.println("INSERTED " + intersection_array[new_array_counter]);
                    new_array_counter++;
                }
                else {
                    continue;
                }
                
                
            }
        }
       
        return intersection_array;
        
    }
    
    public static void main(String[] args) {
      
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        
        System.out.println(intersection(num1, num2));
        
        
    }
    
}