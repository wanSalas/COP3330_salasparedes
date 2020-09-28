import java.util.*;
public class App
{
    public static void main(String[] args)
    {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();
        while (moreInput())
        {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);
            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
    }

    public static void displayBmiInfo(BodyMassIndex bmi) {

    }

    public static boolean moreInput()
    {
        System.out.print("Would you like to enter clients BMI (Y / N): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if("Y".equals(input)||"y".equals(input))
        {
            return true;
        }
        System.out.println("PROGRAM WILL CLOSE HAVE A NICE DAY!!!");
        return false;
    }

    public static double getUserHeight()
    {
        System.out.print("Enter your Height (in inches): ");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextInt();

        if(height <= 0)
        {
            System.out.println("TRY AGAIN");
            return getUserHeight();
        }

        return height;
    }

    public static double getUserWeight()
    {
        System.out.print("What is your weight (in pounds): ");
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextInt();

        if(weight <= 0)
        {
            System.out.println("TRY AGAIN");
            return getUserWeight();
        }

        return weight;
    }

}
