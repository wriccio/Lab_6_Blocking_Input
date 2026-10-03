import java.util.Scanner;

public class HighOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 10) + 1;
        int guess = 0;
        boolean done = false;

        do
        {
            System.out.print("Enter your guess from 1 to 10: ");

            if (in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You must enter a valid integer not: " + trash);
            }

        } while (!done);

        System.out.println("The random number was: " + randomNumber);

        if (guess > randomNumber)
        {
            System.out.println("Your guess was high!");
        }
        else if (guess < randomNumber)
        {
            System.out.println("Your guess was low!");
        }
        else
        {
            System.out.println("You are on the money!");
        }
    }
}
