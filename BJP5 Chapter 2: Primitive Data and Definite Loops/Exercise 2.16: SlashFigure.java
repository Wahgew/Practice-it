/* Write a Java program in a class named SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure. 
(If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!) 

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
*/

public class SlashFigure {
    public static void main(String[] theArgs) {
        for (int count = 1; count <= 6; count++) {
            
            for (int slash = 1; slash <= (2 * count -2); slash++) {
                System.out.print("\\");
            }
            
            for (int mark = 1; mark <= (-4 * count + 26); mark++) {
                System.out.print("!");
            }
            
            for (int fslash = 1; fslash <= (2 * count -2); fslash++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
