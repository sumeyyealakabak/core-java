import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
/*
       Ask the user for their name,
       surname and credit card number
       and convert them into a custom form.

        Initials of the first and last name must be capitalized
        Check the credit card number, if there are no 16 digits it will print "Invalid credit card number"
        If the Credit Card is 16 digits, print it out as stated below.

        Input :
        Gandalf
        Grey
        1234567812345678

        Output :
        İsim : G****** G***
        CCN : ************5678
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name=scan.nextLine();
        name=name.toUpperCase().substring(0,1)+name.substring(1).replaceAll("\\w","*");

        System.out.println("Please enter your surname.");
        String surname=scan.nextLine();
        surname=surname.toUpperCase().substring(0,1)+surname.substring(1).replaceAll("\\w","*");

        System.out.println("Please enter your card number.");
        String cardNumber=scan.nextLine();
        if (!(cardNumber.length()==16))
            System.out.println("Invalid credit card number");

        cardNumber=cardNumber.substring(0,cardNumber.length()-4).replaceAll("\\d","*")+
                cardNumber.substring(cardNumber.length()-4);

        System.out.println("Name : "+ name +" "+ surname +"\n CCN :  "+ cardNumber);

    }
}
