
public class BodyMassIndex {

    double tempH, tempW, result;

    public BodyMassIndex(double height, double weight)
    {
        tempW = weight;
        tempH = height;
    }
    public double bmiScore(){
        double conversion = 703.00;
        result =(conversion * this.tempW/(this.tempH*this.tempH));
        result= Math.round((result * 10) * 1) / 10.0;
        return result;
    }
    public String bmiCategory(){
        String b;
        if (result < 18.5) {
            b = "YOU ARE UNDERWEIGHT";
        } else if ((result) >= 18.5 && (result) <= 24.9) {
            b = "YOU ARE NORMAL";
        } else if ((result) >= 25.0 && (result) <= 29.9) {
            b = "YOU ARE OVERWEIGHT";
        } else{
            b = "YOU ARE OBESE";
        }
        return b;
    }
    public double Average(){
        return result;
    }
}
