/* Write a Java program called DollarFigure that produces the following output. 
Use nested for loops to capture the structure of the figure. 

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

*/

public class DollarFigure {
    public static void main(String[] theArgs) {
        for (int line = 0; line < 7; line++) {
            for (int outStar = 0; outStar < line * 2; outStar++) {
                System.out.print("*");
            }
            
            for (int money = 1; money < -line + 8; money++) {
                System.out.print("$");
            }
            
            for (int inStar = 0; inStar < -line * 2 + 14; inStar++) {
                System.out.print("*");
            }
            
            for (int money = 1; money < -line + 8; money++) {
                System.out.print("$");
            }
            
            for (int outStar = 0; outStar < line * 2; outStar++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
