public class Question9 {
    public static void main(String[] args) {
        /*
        Numbers from 100 to 0, divisible by 13, and
        print their sum (from largest to smallest).
         */
        int sum=0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0) System.out.println(i+" the number is divisible by 13");
            sum +=i;

        }
        System.out.println("Sum: "+sum);




    }
}
