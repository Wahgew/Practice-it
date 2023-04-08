/* Modify your StarFigure code from the previous problem to use a constant for the size. 
The outputs below use a constant size of 3 (left) and 6 (right):

(You must solve this problem using only ONE public static final constant, not multiple constants; 
and its value must be used in the way described in this problem.)


     Size 3
////////\\\\\\\\
////********\\\\
****************

                 Size 6
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

*/

public class StarFigure2 {
    public static final int SIZE = 3;
    
    public static void main(String[] theArgs) {
        for (int line = 1; line <= SIZE; line++) {
            for (int slash = 1; slash <= 4 * (SIZE - line); slash++) { // prints forward slash
                System.out.print("/"); // 4 * (SIZE - line) (SIZE * 4 + line * -4)
            }
            
            for (int stars = 1; stars <= (8 * line - 8); stars++) { //prints stars
                System.out.print("*");
            }
            
            for (int slash = 1; slash <= 4 * (SIZE - line); slash++) { // prints forward slash
                System.out.print("\\");
            }
            System.out.println();   
        }
    }
}
