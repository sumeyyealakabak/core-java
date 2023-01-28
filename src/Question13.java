import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        /*
        Write a method that a number is perfect or not.

        Perfect number: A number is perfect if the sum of its divisors is equal to itself.
        Example:
        INPUT     : 6
        OUTPUT : 1,2,3
                 1+2+3 = 6 = 6 (Perfect)
         */

        System.out.print("Enter the number you are wondering if it is a perfect number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (perfectNumber(number)) {
            System.out.println(number + " is the perfect number");

        } else {
            System.out.println("Number is not the perfect number");
        }

    }
        static boolean perfectNumber ( int number){

            int sum = 0;

            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    sum += i;
                }


            }
            if (sum == number) {
                return true;

            } else return false;

        }
    }















