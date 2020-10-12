public class circle extends shape2D{

    public double area;
    public String name = "circle";

    public circle(double radius){
        this.area = (Math.pow(radius,2))*Math.PI;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }
}
