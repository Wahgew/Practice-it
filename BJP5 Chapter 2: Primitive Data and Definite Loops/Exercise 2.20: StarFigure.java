/* Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************

*/

public class StarFigure {
    public static void main(String[] theArgs) {
        for (int line = 1; line <= 5; line++) {
            for (int slash = 1; slash <= (-4 * line + 20); slash++) { // prints forward slash
                System.out.print("/");
            }
            
            for (int stars = 1; stars <= (8 * line - 8); stars++) { //prints stars
                System.out.print("*");
            }
            
            for (int slash = 1; slash <= (-4 * line + 20); slash++) { // prints forward slash
                System.out.print("\\");
            }
            System.out.println();   
        }
    }
}
