public class CharacterCount {
    
    static void character_count(String string) {
        
        char[] chararray = string.toCharArray();
        
        int character = 0;
        int punctuation = 0;
        int spaces = 0;
        int exclamation = 0;
        int question = 0;
        
        for (char c : chararray) {
            
            if (c == ' ') {
                spaces += 1;
            }
            else if (c == '.' || c == ',') {
                punctuation +=1;
            }
            else if (c == '!') {
                exclamation += 1;
            }
            else if (c == '?') {
                question += 1;
            }
            else {            
                character += 1;
            }
        }
        
        System.out.println("Total character count = " + character);
        System.out.println("# of questions = " + question);
        System.out.println("# of exclamations = " + exclamation);
        System.out.println("# of spaces = " + spaces);
        
    }
    
    public static void main(String[] args) {
        
        String string = "This homework has two parts: in Part A you will write up answers to analytical problems related to the lectures in the past week, both to confirm and extend your understanding of the abstract principles discussed; in Part B you will write code to implement this understanding, and to practice your Java coding skills. I suggest you read this whole assignment carefully and for Part B, it is definitely worth thinking about your solution for a bit before launching Dr. Java and beginning to type. In addition to the requirements for the Java problems, you must observe the following requirements (for all homework submitted in this course):";
        
        character_count(string);
        
    }
    
}