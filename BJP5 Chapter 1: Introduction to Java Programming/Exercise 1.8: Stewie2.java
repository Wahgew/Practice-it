/* Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy. 

//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
*/

public class Stewie2 {
    public static void main (String[] theArgs) {
        System.out.println("//////////////////////");
        victorySlash();
        victorySlash();
        victorySlash();
        victorySlash();
        victorySlash();
    }
    public static void victorySlash() {
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
