import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        double gasGallon;
        double fuelEffic;
        double gasPrice;
        double mileCost;
        double gasDist;

        do
        {
            System.out.print("Enter the number of gallons in a tank: ");

            if (in.hasNextDouble())
            {
                gasGallon = in.nextDouble();
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
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble())
            {
                fuelEffic = in.nextDouble();
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
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }
        } while (!done);

        gasGallon = in.nextDouble();
        in.nextLine();
        fuelEffic = in.nextDouble();
        in.nextLine();
        gasPrice = in.nextDouble();
        in.nextLine();

        gasDist = gasGallon/fuelEffic;
        System.out.println("The car can travel " + gasDist + " miles with the current amount of gas.");

        mileCost = gasPrice * fuelEffic * 100;
        System.out.println("The cost of gas per 100 miles is $" + mileCost);
    }
}
