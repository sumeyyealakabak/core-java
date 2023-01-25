import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /*
        Write a program that reverses the number entered by the user.
         Example:
         Number: 1238
         Reversed: 8321
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number you want to reverse.");
        String number= scan.nextLine();

        String reversed="";
        for (int i = number.length()-1; i >=0 ; i--) {
            reversed+=number.substring(i,i+1);

        }
        System.out.println("The reverse of the number: "+reversed);





    }
}
