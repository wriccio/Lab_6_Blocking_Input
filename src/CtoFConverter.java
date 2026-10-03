import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean done = false;

        do
        {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();

                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }

        } while (!done);

        System.out.println(fahrenheit);
    }
}