package homework;
//. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        int firstTerm = 1;
        int secondTerm = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series is still " + n + " term :");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ,");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
