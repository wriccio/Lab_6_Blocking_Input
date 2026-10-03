import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallonsInTank = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double costFor100Miles = 0.0;
        double distanceWithFullTank = 0.0;

        boolean done = false;

        do
        {
            System.out.print("Enter the number of gallons in the tank: ");

            if (in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                in.nextLine();

                if (gallonsInTank > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a number greater than 0.");
                }
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }

        } while (!done);

        done = false;

        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();

                if (milesPerGallon > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a number greater than 0.");
                }
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }

        } while (!done);

        done = false;

        do
        {
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();

                if (pricePerGallon > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a number greater than 0.");
                }
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }

        } while (!done);

        costFor100Miles = (100.0 / milesPerGallon) * pricePerGallon;
        distanceWithFullTank = gallonsInTank * milesPerGallon;

        System.out.println("Cost to drive 100 miles: " + costFor100Miles);
        System.out.println("Distance with a full tank: " + distanceWithFullTank);
    }
}