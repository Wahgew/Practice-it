/* Write a complete Java program in a class named Egg2 that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution. 

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/

public class Egg2 {
    public static void main(String[] theArgs) {
        shapeLine();
        shapeLine2();
        eggLine();
   }
    
   public static void top() {
       System.out.println("  _______");
       System.out.println(" /       \\");
       System.out.println("/         \\");
   }
        
   public static void bottom() {
      System.out.println("\\         /");
      System.out.println(" \\_______/");
   }
    
   public static void line() {
       System.out.println("-\"-'-\"-'-\"-");
   }
       
   public static void shapeLine() {
       top();
       bottom();
       line();
   }
    
   public static void shapeLine2() {
       shapeLine();
       bottom();
   }
    
   public static void eggLine() {
       top();
       line();
       bottom();
   }
}
