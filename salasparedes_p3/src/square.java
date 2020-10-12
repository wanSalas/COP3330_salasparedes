public class square extends shape2D{

    public double area;

    public square(double length) {

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
