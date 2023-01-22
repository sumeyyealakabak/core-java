import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        /*
        Ask the user for a letter.
        If the user enters more than one letter, ensure that the first letter is retrieved. (Do not include Ö,İ,Ü)
        Also, ignore the capitalization of the entered letter.
        If the letter is a vowel, the letter is a vowel, if not, the letter entered is not a vowel.
        If the letter is a vowel, print "the letter is a vowel", otherwise "the letter is not a vowel".
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter=scan.next().charAt(0);

        if (letter>='A' && letter<= 'Z'|| letter>='a'&& letter<='z'){
        switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
             System.out.println("The letter is a vowel.");
             break;
             default:
             System.out.println("The letter is not a vowel.");}}

            else System.out.println("Invalid login");


    }
}
