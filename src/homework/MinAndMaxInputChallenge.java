package homework;

/* Read the numbers from the console entered by the user and print the minimum
   and maximum number the user has entered */


import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, max, min;
        System.out.println("Enter First Number:  ");
        num1 = scan.nextInt();
        System.out.print("enter another number: ");
        num2 = scan.nextInt();
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
        while (num2 != -99) {
            System.out.print("enter a number or -99 to stop: ");
            num2 = scan.nextInt();
            if (num2 != -99) {
                max = Math.max(max, num2);
                min = Math.min(min, num2);
            }

        }
        System.out.println("largest is: " + max);
        System.out.println("Smallest is: " + min);
        scan.close();

    }
}
