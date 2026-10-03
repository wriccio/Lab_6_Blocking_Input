

import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;

        boolean done = false;

        do
        {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();

                if (width > 0)
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
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();

                if (height > 0)
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

        area = width * height;
        perimeter = 2.0 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
