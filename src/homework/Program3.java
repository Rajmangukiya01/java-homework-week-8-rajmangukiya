package homework;
/* Write a Java program that takes the user to provide a single character from the
   alphabet. Print Vowel of Consonant, depending on the user input. If the user input
   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
   error message */

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet : ");
        char ch = scanner.next().charAt(0);


        if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U'))
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
