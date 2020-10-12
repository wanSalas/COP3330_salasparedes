public class circle extends shape2D{

    public double Area;

    public circle(double radius){
        this.Area = (Math.pow(radius,2))*Math.PI;

    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Area;
    }
}
