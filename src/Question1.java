import java.util.Scanner;

public class Question1 {

        public static void main(String[] args) {
       /*Executes Java programs that accept three numbers and find the largest number.
        example:
• Input:
        First number: 4
        Second number: 8
        Third number: 1

•Output:
        The largest number: 8
        */

            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter 3 numbers");
            double number1= scan.nextDouble();
            double number2= scan.nextDouble();
            double number3=scan.nextDouble();

            if (number1>number2 && number1>number3 ||(number1>number2 && number1>number3 && number2==number3) )
                System.out.println("The first number you enter is the highest: " + number1);
            else if (number2>number1 && number2>number3 ||(number2>number1 && number2>number3 && number1==number3))
                System.out.println("The second number you entered is the highest: " + number2);
            else if (number3>number1 && number3>number2 || (number3>number1 && number3>number2 && number1==number2))
                System.out.println("The third number you entered is the highest: " + number3);
            else System.out.println("Invalid login");
    }
}
