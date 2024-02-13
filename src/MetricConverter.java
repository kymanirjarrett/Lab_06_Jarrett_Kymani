import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        double meters;
        double miles;
        double feet;
        double inches;

        do
        {
            System.out.print("Enter the measurement in meters: ");

            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();

                miles = meters * 0.00062;
                feet = meters * 3.28;
                inches = meters * 39.37;

                System.out.println("The given measurement in miles is " + miles);
                System.out.println("The given measurement in feet is " + feet);
                System.out.println("The given measurement in inches is " + inches);

                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid measurement, not " + trash);
            }
        } while (!done);
    }
}
