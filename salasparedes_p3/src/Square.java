public class Square extends Shape2D {

    public double area;
    public String name = "square";

    public Square(double length) {

        this.area = Math.pow(length, 2);
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
