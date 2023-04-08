/* Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a global constant for the figure's height. 
(You may want to make loop tables first.) The previous output used a constant height of 7. The outputs below use a constant size of 3 (left) and 5 (right): 

   Size 3
$$$******$$$
**$$****$$**
****$**$****


       Size 5
$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********

*/

public static final int SIZE = 3;
public class DollarFigure2 {
    public static void main(String[] theArgs) {
        for (int line = 0; line < SIZE; line++) {
            for (int outStar = 0; outStar < line * 2; outStar++) {
                System.out.print("*");
            }
            
            for (int money = 0; money < -line + SIZE; money++) {
                System.out.print("$");
            }
            
            for (int inStar = 0; inStar < -line * 2 + (SIZE * 2); inStar++) {
                System.out.print("*");
            }
            
            for (int money = 0; money < -line + SIZE; money++) {
                System.out.print("$");
            }
            
            for (int outStar = 0; outStar < line * 2; outStar++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
