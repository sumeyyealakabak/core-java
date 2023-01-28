import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question12 {

        /*
    Fill the array with random numbers between 0-100 and avoid below the average,
    Find the method to find how many are above the average.
     */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please, enter the length of your array: ");
            int length= scan.nextInt();

            createArr(length);
        }

        private static void createArr(int length) {

            int arr[]=new int[length];
            Random rnd=new Random();

            int sum=0;
            for (int i = 0; i < arr.length; i++) {

                arr[i]=rnd.nextInt(100);
                sum+=arr[i];
            }
            double avg=sum/arr.length;

            int belowAvg=0,aboveAvg=0,equalAvg=0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i]<avg){
                    belowAvg++;

                }else if(arr[i]>avg){
                    aboveAvg++;

                }else{
                    equalAvg++;
                }
            }
            System.out.println(Arrays.toString(arr));

            System.out.println("Average: "+avg+"\n"
                    +belowAvg+" number is below the average\n" +
                    aboveAvg+" number is above the average\n" +
                    equalAvg+" number is equal the average");
        }
    }
