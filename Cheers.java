// nice, very clean 
public class Cheers {
        public static void main(String[] args) {
        
        // inputs
	    String word = args[0];
        int printTimes = Integer.parseInt(args[1]);

        // string to uppercase
        word = word.toUpperCase();

        // intigers used later for while
        int i = 0;
        int printWord = 0;
        int length = word.length();

        // special characters string
        String special_c = "AEFHILMNORSX";

        // print by characters
        while (i < length) {
            char c = word.charAt(i);
            if (special_c.indexOf(c) != -1) {
                System.out.println("Give me an " + c + ": " + c + "!");
            }
            else {
               System.out.println("Give me a  " + c + ": " + c + "!"); 
            }
            i += 1;
        }
        System.out.println("What does that spell?");

        // count the number of times that the word should be printed
        while (printWord < printTimes) {
                System.out.println(word + "!!!");
                printWord += 1;
            }
        }
}