/* Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-
*/

public static void printDesign() {
    for (int line = 1; line <= 5; line++) {
        for (int i = 1; i <= (-1 * line + 6); i++) {
          System.out.print("-");
        }
        
        for (int num = 1; num <= (2 * line - 1); num++) {
          System.out.print(2 * line - 1);
        }
        
        for (int dash = 1; dash <= (-1 * line + 6); dash++) {
          System.out.print("-");
        }
        System.out.println();
   }
}
