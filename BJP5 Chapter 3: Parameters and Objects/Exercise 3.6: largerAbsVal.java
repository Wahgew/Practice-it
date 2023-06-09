/* Write a method called largerAbsVal that takes two integers as parameters and returns the larger of the two absolute values. 
A call of largerAbsVal(11, 2) would return 11, and a call of largerAbsVal(4, -5) would return 5.
*/

public static int largerAbsVal(int value1, int value2) {
    int abs1 = Math.abs(value1);
    int abs2 = Math.abs(value2);
    int largeAbs = (int) Math.max(abs1, abs2);
    return largeAbs;
}
