import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        Get a three-digit number from the user.
        Print the sum of the digits of this number received from the user on the screen.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a three digit number");
        int number=scan.nextInt();
        int onesDigit=0;
        int sum=0;

        onesDigit=number%10;
        sum+=onesDigit;
        number/=10;

        onesDigit=number%10;
        sum+=onesDigit;
        number/=10;

        onesDigit=number%10;
        sum+=onesDigit;
        number/=10;

        System.out.println("The sum of the digits of the number you entered: " + sum);
















    }
}
