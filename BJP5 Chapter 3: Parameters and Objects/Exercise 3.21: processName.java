/* Write a method called processName that accepts a Scanner for the console as a parameter and that prompts the user to enter his or her full name, 
then prints the name in reverse order (i.e., last name, first name). You may assume that only a first and last name will be given. 
You should read the entire line of input at once with the Scanner and then break it apart as necessary. Here is a sample dialogue with the user:

Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy
*/

public static void processName(Scanner console) {
    System.out.print("Please enter your full name: ");
    
    String name1 = console.next();
    String name2 = console.next();
    
    System.out.print("Your name in reverse order is " + name2 + ", " + name1);
}
