import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        int randGuess;

        Random generator = new Random();
        int randInt = generator.nextInt(10);

        do
        {

            System.out.print("Guess the random number [1 - 10]: ");

            if(in.hasNextInt(1-10))
            {
                randGuess = in.nextInt();
                in.nextLine();

                System.out.println("Your guess was " + randGuess);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must input a valid ");
            }

        } while (!done);

        System.out.println("The random number was " + randInt);


        if(randInt == randGuess)
        {
            System.out.println("You're right on the money!");
        }
        else if (randInt > randGuess)
        {
            System.out.println("Your guess was low.");
        }
        else
        {
            System.out.println("Your guess was high.");
        }

    }
}
