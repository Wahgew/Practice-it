/* Write a method called distance that accepts four integer coordinates x1, y1, x2, and y2 as parameters 
and computes the distance between points (x1, y1) and (x2, y2) on the Cartesian plane. The equation for the distance is:

d = sqrt((x2-x1)²+(y2-y1)²)

For example, the call of distance(1, 0, 4, 4) would return 5.0 and the call of distance(10, 2, 3, 5) would return 7.615773105863909.
*/

public static double distance (int x1, int y1, int x2, int y2) {
    double distanceX = Math.pow((x2 - x1), 2);
    double distanceY = Math.pow((y2 - y1), 2); 
    return Math.sqrt(distanceX + distanceY);     
}
