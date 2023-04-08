/* It's common to print a rotating, increasing list of single-digit numbers at the start of a program's output as a visual guide 
to number the columns of the output to follow. With this in mind, write nested for loops to produce the following output, 
with each line 60 characters wide: 

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890
*/

for (int bar = 1; bar <= 6; bar++) {
    System.out.print("         |");
}

System.out.println();

for (int number = 1; number <= 6; number++) {
    for (int num = 1; num <= 9; num++) {
        System.out.print(num);
    }
    System.out.print("0");
}
