import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        //Write java code that calculates the area and perimeter of a circle.


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the radius of the circle whose area and perimeter you want to calculate.");
        double radius=scan.nextDouble();
        System.out.println("Area of the circle: " +radius*3.14*radius+
                            "\nPerimeter of the circle " + radius*2*3.14);

    }
}
