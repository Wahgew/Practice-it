/* Write for loops to produce the following output, with each line 40 characters wide: 

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
*/

for (int topwave = 1; topwave <= 40; topwave++) {
    System.out.print("-");
}
System.out.println();

for (int middlewave = 1; middlewave <= 10; middlewave++) {
    System.out.print("_-^-");
}

System.out.println();

for (int number = 1; number <= 2; number++) {
    for (int num = 1; num <= 9; num++) {
        for (int twice = 1; twice <= 2; twice++) {
            System.out.print(num);
        }    
    }
    System.out.print("00");
}

System.out.println();
for (int topwave = 1; topwave <= 40; topwave++) {
    System.out.print("-");
}
