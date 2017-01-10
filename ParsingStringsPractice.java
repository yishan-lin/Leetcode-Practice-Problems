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
        
        String string = "It was hot (so hot!) I'm telling you.";
        
        System.out.println(string.indexOf("I"));
        System.out.println(string.indexOf("("));
        System.out.println(string.indexOf(")"));
        
        int left = string.indexOf("(") + 1;
        int right = string.indexOf(")");
        
        String upperportion = (string.substring(left, right)).toUpperCase();
        
        System.out.println(string.substring(0, left) + upperportion + string.substring(right, string.length()));
        
        
    }
    
}