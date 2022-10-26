package homework;
/* Display left angle triangle of * using nested for loops */
import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        star();
    }

    public static void star() {
        int i, j, rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row number : ");
        rows = scan.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            scan.close();
        }
    }
}
