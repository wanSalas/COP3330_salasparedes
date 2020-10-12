public class triangle extends shape2D {
    public double area;

    public triangle(double Base, double Height){

        this.area = (Base*Height)/2.00;

    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getName() {
        return "triangle";
    }
}
