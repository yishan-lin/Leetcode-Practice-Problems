public class ParsingStringsPractice {
    
    public static void main(String[] args) {
        
        /*String string = "  the music made   it   hard      to        concentrate    ";
         * 
         String[] stringarray = string.trim().split(" +");
         
         for (String x: stringarray) {
         
         System.out.println(x);
         
         }
         
         String employee = "Smith,Katie,3014,,8.25,6.5,,,10.75,8.5";
         
         String[] employeeparse = employee.trim().split(",");
         
         for (int x = 0; x < employeeparse.length; x++) {
         
         if (employeeparse[x].equals("")) {
         
         System.out.print("__");
         
         }
         
         else {
         
         System.out.print(employeeparse[x]);
         
         }
         }
         
         System.out.println();
         
         String sentence = "This is a sentence.  This is a question, right?  Yes!  It is.";
         
         String[] sentencearray = sentence.trim().split("[ ,.!?]+");
         
         for (String x:sentencearray) {
         
         System.out.println(x);
         
         }
         
         String employeelist = "Smith,Katie,3014,,8.25,6.5,,,10.75,8.5||Smith,Katie,3014,,8.25,6.5,,,10.75,8.5";
         
         String employeelistarray[] = employeelist.trim().split("[||]");
         System.out.println("array length = " + employeelistarray.length);
         
         for (int x = 0; x < employeelistarray.length; x++) {
         
         System.out.println("x = " + x);
         System.out.println(employeelistarray[x]);
         
         }
         
         String companies = "palantir,, google";
         
         int a = companies.indexOf("p");
         
         System.out.println("a = " + a);
         
         String[] companyarray = companies.trim().split("[ ,]+");
         
         
         for (String x: companyarray) {
         
         System.out.println(x);
         
         }*/
        
        /*String string = "It was hot (so hot!) I'm telling you.";
         * 
         System.out.println(string.indexOf("I"));
         System.out.println(string.indexOf("("));
         System.out.println(string.indexOf(")"));
         
         int left = string.indexOf("(") + 1;
         int right = string.indexOf(")");
         
         String upperportion = (string.substring(left, right)).toUpperCase();
         
         System.out.println(string.substring(0, left) + upperportion + string.substring(right, string.length()));
         
         
         /*ven a string, returns how many '!' chars it contains. 
         *This code demonstrates using a for loop, calling length(), substring()/charAt(), and equals() to look at all the chars in a string:*/
        
        /* String valleyman = "Oh my God!! That was so awesome!!!";
         * 
         char[] valleymanarray = valleyman.toCharArray();
         
         int exclamationcount = 0;
         
         for (char x: valleymanarray) {
         
         if (x == '!') {
         exclamationcount+= 1;
         }
         
         }
         
         System.err.println("Oh my God!! That was so awesome!!!");
         System.out.println("# of exclamations: " + exclamationcount);
         
         /*Given a string where the string "OOP" appears at least two times, 
         * find the first and last OOP in the whole string. Return the text from between the two OOP. 
         * Demonstrates using indexOf() and substring():*/
        
        /*String parsethis = "OOP FSALDKFASL FDKJAS  LKFAJL FSAFSAOOP ASDFASJ FLKSA DFA";
         * 
         System.out.println("The 1st time this appears: " + parsethis.indexOf("OOP"));
         System.out.println("The last time this string appears: " + parsethis.lastIndexOf("OOP"));
         
         System.err.println(parsethis.substring(parsethis.indexOf("OOP") + 1, parsethis.lastIndexOf("OOP")));
         
         /*Suppose you have a string like this:"Once there was a woman name:angelina: and a man name:tony: 
         * and their friend name:jane: and ...". Inside of a long text there are little "name:" sections. Write 
         * code to find and print all the names. Demonstrates a more complex use of indexOf() and substring() in a loop to parse a string:*/
        
        /* String exampletest = "Once there was a woman name:angelina: and a man name:tony: and their friend name:jane:";
         * 
         System.err.println("example test length = " + exampletest.length());
         
         int index_iterator = 0;
         
         while (index_iterator <= exampletest.length()) {
         
         int first = exampletest.indexOf("name:", index_iterator);
         System.out.println("first = " + first);
         
         int last = exampletest.indexOf(": ", first + 5);
         
         if (last == -1) {
         
         System.out.println("we've reached the end of the string");
         last = exampletest.length() - 1;
         
         System.out.println(exampletest.substring(first+5, last));
         break;
         
         
         }
         
         System.out.println("last = " + last);
         
         System.out.println(exampletest.substring(first + 5, last));
         
         index_iterator = last;
         
         }
         */
        
        String[] datafeed = {"0|20", "0|Kristi|SELL|3000", "0|Will|BUY|5000", "0|Tom|BUY|5000", "0|Shilpa|BUY|1500","1|Tom|BUY|1500000","3|25","5|Shilpa|SELL|1500"}; 
        
        System.out.println("datafeedlength = " + datafeed.length);
        
        for (int x = 0; x < datafeed.length; x++) {
         
            String[] datafeedsplit = datafeed[x].trim().split("\\|");
            
            for (String y: datafeedsplit) {
                
                System.out.println(y);
                
            }
            
            System.out.println("");
            
        }
        
        
        
        
        //for (int x = 0; x < exampletest.length(); x++) {
        
        /*     System.out.println(exampletest.indexOf(":"));
         * 
         char[] exampletestarray = exampletest.toCharArray();
         int[] colonindex = new int[exampletestarray.length];      
         
         for (int x = 0; x < exampletestarray.length; x++) {
         
         if (exampletestarray[x] == ':') {
         System.out.println("found one! " + "@ ");
         
         }
         }*/
        
    }
    
}