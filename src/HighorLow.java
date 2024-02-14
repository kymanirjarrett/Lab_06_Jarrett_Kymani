import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        int randGuess = 0;

        Random generator = new Random();
        int randInt = generator.nextInt(10);

        do
        {

            System.out.print("Guess the random number [1 - 10]: ");

            if(in.hasNextInt())
            {
                randGuess = in.nextInt();
                in.nextLine();

                if(randGuess >= 1 && randGuess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must input a valid guess between 1 and 10, not: " + randGuess);
                }

                System.out.println("Your guess was " + randGuess);

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must input a valid guess, not " + trash);
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
