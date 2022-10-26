package homework;
/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        System.out.println("Enter 3 digit number : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (isArmStrong(number)) {
            System.out.println("Number " + number + " is an Armstrong number");
        } else {
            System.out.println("Number " + number + " is not an Armstrong number");
        }
    }

    public static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        if (orig == result) {
            return true;
        }
        return false;
    }
}
