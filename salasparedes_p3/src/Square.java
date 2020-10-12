public class Square extends shape2D{

    public double length;
    public double area;

    public Square(double length) {

        this.area = Math.pow(length, 2);
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return area;
    }
}
