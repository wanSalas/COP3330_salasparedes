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

            displayBmiInfo(bmi); //hello
        }

        displayBmiStatistics(bmiData);
    }

    static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        System.out.println(bmiData.size());
        for (int i=0;i<bmiData.size();i++){
            System.out.println(bmiData.get(i).Average());
        }
    }

    static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.println(bmi.bmiScore());
        System.out.println(bmi.bmiCategory());
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
