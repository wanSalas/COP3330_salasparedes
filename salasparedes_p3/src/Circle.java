public class Circle extends Shape2D {

    public double area;
    public String name = "circle";

    public Circle(double radius){
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
