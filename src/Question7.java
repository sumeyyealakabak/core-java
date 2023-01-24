public class Question7 {
    public static void main(String[] args) {
        /*
        Create a program to calculate and print the sum of two given numbers
         - which can be greater than or equal to zero

         Example:
        Enter two integers:
        25 or 46
        Output on console:
        Sum of numbers: 71

        Enter two integers:
        4567986321453 or 123456
        Sum of numbers: Overloaded

         */

        int input1=-25;
        int input2=-469876433;
        int sum=input1+input2;


        if (sum>=0 ){
            if (input1>=1000000000 || input2>=1000000000 || sum>=1000000000)
                System.out.println("Sum of numbers: "+"Overloaded");

            else System.out.println("Sum of numbers: " + sum);
        }
        else System.out.println("The sum of the given numbers is a negative number: " + sum);
    }
}
