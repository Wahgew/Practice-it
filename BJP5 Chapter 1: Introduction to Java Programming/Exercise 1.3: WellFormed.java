/* Write a complete Java program in a class named WellFormed that prints the following output: 

A well-formed Java program has
a main method with { and }
braces.

A System.out.println statement
has ( and ) and usually a
String that starts and ends
with a " character.
(But we type \" instead!)
*/

public class WellFormed {
    public static void main(String[] theArgs) {
        System.out.println("A well-formed Java program has\na main method with { and }\nbraces.");
        System.out.println("");
        System.out.println("A System.out.println statement\nhas ( and ) and usually a\nString that starts " + 
                           "and ends\nwith a \" character.\n(But we type \\\" instead!)");
    }
}
