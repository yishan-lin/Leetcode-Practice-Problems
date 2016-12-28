/*Given an array of integers where 1 ² a[i] ² n (n = size of array), some elements appear twice and others appear once.
 * 
 Find all the elements of [1, n] inclusive that do not appear in this array.
 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 
 Input:
 [4,3,2,7,8,2,3,1]
 
 Output:
 [5,6]*/

import java.util.Arrays;
import java.util.ArrayList;

public class DisappearedNumbers {
    
    public static boolean member(int[] testarray, int count) {
        
        for (int x = 0; x < testarray.length; x++) {
            
            if (testarray[x] == count) {
                return true;
            }
           
        }
        
        return false;
        
    }
    
    private static int count = 1;
    
    public static void find_disappearing(int[] testarray) {
        
        while (count < testarray.length) {
            
            if (!(member(testarray, count))) {
                
                //List<Integer> solutionarray = new ArrayList<Integer>();
                
                //return new int[] {count};
                
                System.out.println("MISSING " + count);
                
            }
            
            count++;
            
        }
        
        //return new int[] {count};
        
    }
    
    public static void main(String[] args) {
        
        int[] testarray = {4, 3, 2, 7, 8, 2, 3, 1};
        
        //System.out.println(Arrays.toString(array));

        
        find_disappearing(testarray);
        
    }
    
}