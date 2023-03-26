/* Write a program called FarewellGoodBye that prints the following lyrics. 
Use static methods to show structure and eliminate redundancy in your solution. 

Farewell,
goodbye,
au revoir,
good night!
It's time, to go,
and I'll be out of sight!

Farewell,
goodbye,
au revoir,
take care!
I'll say, goodbye,
that's neither here nor there!

Farewell,
goodbye,
au revoir,
see you later!
I hope, you think,
I'm a lover, not a hater!
*/

public class FarewellGoodBye {
    public static void main(String[] theArgs) {
        farewell();
        goodNight();
        farewell();
        deuces();
        farewell();
        sayonara();
   }
    
   public static void farewell() {
       System.out.println("Farewell,\ngoodbye,\nau revoir,");
   }
    
   public static void goodNight() {
       System.out.println("good night!\nIt's time, to go,\nand I'll be out of sight!\n");
   }
    
   public static void deuces() {
       System.out.println("take care!\nI'll say, goodbye,\nthat's neither here nor there!\n");
   }
    
   public static void sayonara() {
       System.out.println("see you later!\nI hope, you think,\nI'm a lover, not a hater!");
   }
}
