public class Triangle extends Shape2D {

    public double area;
    public String name = "triangle";

    public Triangle(double Base, double Height){

        this.area = (Base*Height)/2.00;

    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getName() {
        return name;
    }
}
