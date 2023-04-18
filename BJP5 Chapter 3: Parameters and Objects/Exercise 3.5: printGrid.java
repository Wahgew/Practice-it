/* Write a method named printGrid that accepts two integer parameters rows and cols. 
The output is a comma-separated grid of numbers where the first parameter (rows) represents the number of rows of the grid 
and the second parameter (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). 
The output are displayed in column-major order, meaning that the numbers shown increase sequentially down each column and wrap to the 
top of the next column to the right once the bottom of the current column is reached. Assume that rows and cols are greater than 0.

Here are some example calls to your method and their expected results:

printGrid(3, 6);
1, 4, 7, 10, 13, 16
2, 5, 8, 11, 14, 17
3, 6, 9, 12, 15, 18


printGrid(5, 3);	
1, 6, 11
2, 7, 12
3, 8, 13
4, 9, 14
5, 10, 15


printGrid(4, 1);	
1
2
3
4


printGrid(1, 3);
1, 2, 3
*/

public static void printGrid(int row, int col) {
    for (int i = 1; i <= row; i++) {
        int hold = i;
        System.out.print(i);
        for (int j = 1; j < col; j++) {
            hold += row;
            System.out.print(", " + hold);
        }
        System.out.println();
    }
}
