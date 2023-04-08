/* Write nested for loops to produce the following output: 

    1
   22
  333
 4444
55555

*/

for (int line = 1; line <= 5; line++) {
    for (int number = 1; number <= (-1 * line + 5); number++) {
        System.out.print(" ");
    }
    for (int num = 1; num <= line; num++) {
        System.out.print(line);
    }
    System.out.println();
}
