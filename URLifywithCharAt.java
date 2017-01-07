public class URLifywithCharAt {
    
    static void uRLify(String string) {
     
        //first count the # of whitespaces, becaise we have to add 3 character spaces, the %20 to each whitespace
        
        char[] chararray = string.toCharArray();
        
        int whitespacecount = 0;
        
        for (char x : chararray) {
         
            if (x == ' ') {
                whitespacecount++;
            }
            
        }
        
        System.out.println("old length = " + chararray.length);
        int newlength = chararray.length + 3*whitespacecount;
        System.out.println("newlength = " + newlength);
        
        char[] solutionarray = new char[newlength];
        //solutionarray = chararray;
        
        int y = newlength - 1;
        
        for (int x = chararray.length - 1; x >= 0; x--) {
         
            System.out.println("chararray[x] = " + chararray[x]);
            
            if (chararray[x] == ' ') {
                
                System.out.println("whitespace spotted in program");
                solutionarray[y] = '0';
                solutionarray[y-1] = '2'; 
                solutionarray[y-2] = '%';
                y -= 3;
                    
            }
            
            else {
             
                solutionarray[y] = chararray[x]; 
                y--;
            }
            
            //System.out.println("finished for loop");
            
        }
        
        for (int x = 0; x < solutionarray.length; x++) {
         
            System.out.print(solutionarray[x]);
            
        }
        
    }
    
    public static void main(String[] args) {
        
        String string = "Ms Jones Smith";
        uRLify(string);
        
    }
    
}