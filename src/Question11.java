public class Question11 {
    public static void main(String[] args) {
        /*
        Find the number of letters "A" in a given String.
        But if it comes to the letter "C" get out of the loop
         */

        String input = "The weather is very nice today";
        input=input.toUpperCase();

        int a = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i)=='A'){
                a ++;
                System.out.println("In the sentences:  \""+input+" \" The letter \"A\" is used: "+i +" times till \"C\"");}

            if (input.charAt(i)=='C'){
                break;
            }
        }
    }
    }

