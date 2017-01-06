/*Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example: n = 15,
Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]*/

public class FizzBuzzString {
    
    static void fizzbuzz(int n) {
     
        for (int x = 0; x <= n; x++) {
         
            if (x % 3 == 0 && x % 5 == 0) {
             
                System.out.println("FizzBuzz");
                
            }
            
            else if (x % 3 == 0) {
                
                System.out.println("Fizz");
                
            }
            
            else if (x % 5 == 0) {
                
                System.out.println("Buzz");
                
            }
            
            else {
                
                System.out.println(x);
            
            }
            
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        fizzbuzz(15);
        
    }
    
}