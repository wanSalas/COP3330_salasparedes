import java.util.*;
public class InitialQuestion {
    public static void main(String[] args){
        int number = 8;
        Contact c = new Contact("juan", "wan.salad@gmail.com","7864612635");
        question1();
        question2();
        question3(number);
        question4();
        question5();
        question6(number);
    }

    public static void question1() {

    }

    public double sumOfNumber(ArrayList<Double> Values){
        double result = 0;
        for (Double Value : Values){
            result+=Value;
        }
        return result;
    }
    public static void question2(){

    }
    public static void question3(int number){
        if (number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void question4(){
        // in parameters state the billAmount
        // initialize tip_percent and set to an appropriate amount (20%)
        // and initialize tip_final to 0
        // now do tip_final = billAmount * tip_percent
        // return tip_final
    }
    public static void question5(){
        // which keyword indicates that one class can access variables and methods of another
        // its the keyword EXTENDS
    }
    public static void question6(int n){ ;
    int answer = 1;
    for (int i = 1; i <= n ; i+=2){
           answer *= i;
            System.out.print(answer);
        }
    }
}
