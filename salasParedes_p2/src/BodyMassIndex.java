public class BodyMassIndex {
    public BodyMassIndex(double height, double weight)
    {
        double pounds = 0,inches = 0,conversion = 703.00,BMI = 0.00;

        pounds = weight;
        inches = height;

        BMI = (conversion * pounds/(inches*inches));
        BMI= Math.round((BMI * 10) * 1) / 10.0;

        String b;
        if (BMI < 18.5) {
            b = "YOU ARE UNDERWEIGHT(EAT)";
        } else if ((BMI) >= 18.5 && (BMI) <= 24.9) {
            b = "YOU ARE NORMAL (POG CHAMP)";
        } else if ((BMI) >= 25.0 && (BMI) <= 29.9) {
            b = "YOU ARE OVERWEIGHT (STOOPID)";
        } else{
            b = "YOU ARE OBESE (FATASS)";
        }
        System.out.println("Your BMI is: " +BMI);
        System.out.println("" +b  );
    }
}
