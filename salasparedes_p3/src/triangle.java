public class triangle extends shape2D {
    public double Area;

    public triangle(double Base, double Height){

        this.Area = (Base*Height)/2.00;

    }

    @Override
    public double getArea() {
        return Area;
    }

    @Override
    public String getName() {
        return "triangle";
    }
}
