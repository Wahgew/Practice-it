/* Write a complete Java program in a class named Lanterns that generates the following three figures of output. 
Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines, that any System.out.println statement(s) 
repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code. 

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
*/

public class Lanterns {
    public static void main(String[] theArgs) {
        roof();
        System.out.println();
        roof();
        window();
        line();
        roof();
        System.out.println();
        roof();
        shortLine();
        window();
        window();
        shortLine();
        shortLine();
   }
    
   public static void roof() {
       System.out.println("    *****");
       System.out.println("  *********");
       System.out.println("*************");
   }
        
   public static void window() {
       System.out.println("* | | | | | *");
   }
    
   public static void tall() {
       System.out.println("  *");
       System.out.println("  *");
       System.out.println("  *");
   }
    
   public static void line() {
       System.out.println("*************");
   }
    
   public static void shortLine() {
       System.out.println("    *****");
   }
}
