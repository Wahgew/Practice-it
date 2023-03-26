/* Write a program in a class named Shining that prints the following line of output 1000 times: 

You should not write a program whose source code is 1000 lines long; use methods to shorten the program. 
What is the shortest program you can write that will produce the 1000 lines of output, 
using only the material from Chapter 1 (println, methods, etc.)?

All work and no play makes Jack a dull boy.
*/

public class Shining {
    public static void main(String[] theArgs) {
        words2();
        words2();
        words2();
        words2();
        words2();
        words2();
        words2();
        words2();
        words2();
        words2();
    }
    
    public static void words() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
    
    public static void words2() {
        words();
        words();
        words();
        words();
        words();
        words();
        words();
        words();
        words();
        words();
    }
}
