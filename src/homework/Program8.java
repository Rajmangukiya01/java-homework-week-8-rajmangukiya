package homework;
/*Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
*/

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int row = scanner.nextInt();

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("@");
            System.out.println("");
        }
    }
}
