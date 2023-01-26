import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        //Write the method that collects the numeric values in the string expression entered by the user

            Scanner scan = new Scanner(System.in);
            System.out.println("Please write a sentence: ");
            String sentence=scan.nextLine();

            System.out.println("Sum of numerical values: "+SumNumericValues(sentence));
    }
    private static int SumNumericValues(String sentence) {
        int sum=0;
        String sentenceArr[]=sentence.split("");

        for (int i = 0; i < sentenceArr.length; i++) {
            if (Character.isDigit(sentenceArr[i].charAt(0))){
                sum+=Integer.valueOf(sentenceArr[i]);
            }
        }
        return sum;
    }
}
