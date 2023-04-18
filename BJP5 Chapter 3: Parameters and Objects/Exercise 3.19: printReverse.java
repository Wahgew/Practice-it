/* Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. 
For example, a call of printReverse("hello there!"); should print the following output:

!ereht olleh

If the empty string is passed, no output is produced. Your method should produce a complete line of output.
*/

public static void printReverse(String words) {
    for (int line = words.length(); line > 0; line--) {
        String letter = words.substring(line - 1, line);
        System.out.print(letter);
    }
}
