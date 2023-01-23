import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*
        Ask the user for their weight and height
        and write a program that calculates their body mass index.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your weight in kg.");
        double weight= scan.nextDouble();

        System.out.println("Please enter your height in cm.");
        double height= scan.nextDouble();

        double bmi= weight/(height * height);


        if (bmi>=30)
            System.out.println("You are obese, you should take care of yourself before it's too late");

        else if (bmi>=25)
            System.out.println("You are overweight, you should start the diet");

        else if (bmi>=20)
            System.out.println("Your weight is normal, continue with it");

        else System.out.println("You are thin, you should gain weight");

        System.out.println("Your body mass index : " + bmi);












    }
}
