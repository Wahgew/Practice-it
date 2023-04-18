/* Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values.
For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.

*/

public static int largestAbsVal(int value1, int value2, int value3) {
    int abs1 = Math.abs(value1);
    int abs2 = Math.abs(value2);
    int abs3 = Math.abs(value3);
    
    int largeAbs = (int) Math.max(abs1, abs2);
    int largestAbs = (int) Math.max(largeAbs, abs3);
    return largestAbs;  
}
