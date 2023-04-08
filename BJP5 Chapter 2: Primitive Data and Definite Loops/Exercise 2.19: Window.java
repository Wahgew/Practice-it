/* Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops to print the repeated parts of the figure. 
Once you get it to work, add one class constant to your program so that the size of the figure can be changed simply by changing that constant's value. 
The example output shown is at a constant size of 3, but if you change the constant, the figure should grow larger and wider proportionally. 

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+

*/

public class Window {
    public static final int SIZE = 3;
    
    public static void main(String[] theArgs) {
        //Frame
        System.out.print("+");
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }     
        System.out.print("+");
        
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
        
        //Glass
        for (int glass = 0; glass < SIZE; glass++) {
            System.out.print("|");
            for (int space = 0; space < SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int space2 = 0; space2 < SIZE; space2++) {
               System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        
        //Frame
        System.out.print("+");
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }     
        System.out.print("+");
        
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
        
        //Glass
        for (int glass = 0; glass < SIZE; glass++) {
            System.out.print("|");
            for (int space = 0; space < SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int space2 = 0; space2 < SIZE; space2++) {
               System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        // Frame
        System.out.print("+");
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }     
        System.out.print("+");
        
        for (int frame = 0; frame < SIZE; frame++) {
            System.out.print("=");
        }
        System.out.print("+");
        System.out.println();
    }
}
