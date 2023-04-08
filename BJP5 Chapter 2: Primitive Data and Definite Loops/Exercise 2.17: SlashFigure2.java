/* Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 that uses a global constant for the figure's height. 
The previous output used a constant height of 6. Here is the outputs for a constant height of 4 and 7 respectively: 
(If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!) 


    Size 4                      Size 7
!!!!!!!!!!!!!!        !!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!//        \\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!////        \\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!//////        \\\\\\!!!!!!!!!!!!!!//////
                      \\\\\\\\!!!!!!!!!!////////
                      \\\\\\\\\\!!!!!!//////////
                      \\\\\\\\\\\\!!////////////

*/

public class SlashFigure2 {
    public static final int SIZE = 4;
    
    public static void main(String[] theArgs) {
        for (int count = 1; count <= SIZE; count++) {
            
            for (int slash = 1; slash <= (2 * count -2); slash++) {
                System.out.print("\\");
            }

            
            for (int mark = 1; mark <= (SIZE * 4 + count * -4) + 2; mark++) {
                System.out.print("!");
            }
            
            for (int fslash = 1; fslash <= (2 * count -2); fslash++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
