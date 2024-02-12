import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        int tempC;  // (C * 9/5) + 32 = F
        int tempF;

        do
        {
            System.out.print("Enter the temperature in degrees Celsius: ");

            if(in.hasNextInt())
            {
                tempC = in.nextInt();
                in.nextLine();

                tempF = (tempC * 9/5) + 32;
                System.out.println("The given temperature in degrees Fahrenheit is " + tempF);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid temperature, not " + trash);
            }

        } while (!done);
    }
}