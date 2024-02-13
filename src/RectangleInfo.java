import java.util.Scanner;
import static java.lang.Math.sqrt;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        double width;
        double height;
        double area;
        double perimeter;
        double hypotenuse;

        do
        {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }
        } while (!done);

        done = false;

        do
        {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }


            width = in.nextDouble();
            height = in.nextDouble();

            area = width * height;
            perimeter = (width * 2) + (height * 2);
            hypotenuse = sqrt(Math.pow(width,2) + Math.pow(height,2));

            System.out.println("The area of the rectangle is " + area + " and the perimeter of the rectangle is " + perimeter);
            System.out.println(" The lenght of the diagonal or hypotenuse is " + hypotenuse);

        } while (!done);
    }
}
