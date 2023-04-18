/* Write a method called printIndexed that accepts a String as its parameter and prints the String's characters in order followed by their indexes in reverse order. 
For example, the call of printIndexed("ZELDA"); should print Z4E3L2D1A0 to the console.
*/

public static void printIndexed(String theWord) {
    int index = 0;
    
    for (int letter = theWord.length() - 1; letter >= 0; letter--) {
        System.out.print("" + theWord.charAt(index) + letter);
        index += 1;
    }
}
