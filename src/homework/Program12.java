package homework;
//Write a programme to input any number and check if it is prime or not

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not : ");
        int number = scan.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}
