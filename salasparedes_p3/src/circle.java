public class circle extends shape2D{

    public double area;

    public circle(double radius){
        this.area = (Math.pow(radius,2))*Math.PI;

    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return area;
    }
}
