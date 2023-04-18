/* Write a method called sphereVolume that accepts a radius (a real number) as a parameter and returns the volume of a sphere with that radius. 
For example, the call sphereVolume(2.0) should return 33.510321638291124. The formula for the volume of a sphere with radius r is the following:

volume = 4/3 πr^3
*/

public static double sphereVolume(double radius) {
    return (Math.pow(radius, 3) * 4 * Math.PI) / 3;
}
