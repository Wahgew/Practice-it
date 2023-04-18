/* Write a complete program called "TheNameGame", where the user inputs a first and last name 
and a song in the following format is printed about their first, then last, name. Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
*/

public class TheNameGame {
    public static void main(String[] theArgs) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        
        String name1 = console.next();
        String name2 = console.next();
        
        getName(name1, name2);    
    }
    
    public static void getName(String theFirst, String theLast) {
    
        System.out.println(theFirst + " " + theFirst + ", bo-B"+ theFirst.substring(1));
        System.out.println("Banana-fana fo-F" + theFirst.substring(1));
        System.out.println("Fee-fi-mo-M" + theFirst.substring(1));
        System.out.println(theFirst.toUpperCase() + "!");
        
        System.out.println();
        System.out.println(theLast + " " + theLast + ", bo-B" + theLast.substring(1));
        System.out.println("Banana-fana fo-F" + theLast.substring(1));
        System.out.println("Fee-fi-mo-M" + theLast.substring(1));
        System.out.println(theLast.toUpperCase() + "!");
    }     
}
