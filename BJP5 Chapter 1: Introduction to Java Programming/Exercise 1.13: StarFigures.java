/* Write a complete Java program in a class named StarFigures that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution. 

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/

public class StarFigures {
    public static void main(String[] theArgs) {
        block();
        shapex();
        System.out.println("");
        block();
        shapex();
        block();
        System.out.println("");
        tall();
        block();
        shapex();
   }
    
   public static void block() {
       System.out.println("*****\n*****");
   }
        
   public static void shapex() {
       System.out.println(" * *");
       System.out.println("  *");
       System.out.println(" * *");
   }
    
   public static void tall() {
       System.out.println("  *");
       System.out.println("  *");
       System.out.println("  *");
   }  
}
