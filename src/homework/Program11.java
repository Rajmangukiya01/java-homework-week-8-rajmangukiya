package homework;

public class Program11 {
    public static void main(String[] args) {
        System.out.println(sumEvenDigits(123456789));
        System.out.println(sumEvenDigits(252));
        System.out.println(sumEvenDigits(-22));
    }

    public static int sumEvenDigits(int number) {
        int digit;
        int sum = 0;
        if (number <0){
            return -1;
        }
        while(number != 0)
        {
            digit = number % 10;

            if(digit % 2 == 0)
                sum = sum + digit;

            number = number / 10;
        }
        return sum;
    }
}
