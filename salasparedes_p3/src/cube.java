public class cube extends shape3D {

    public double area;
    public double volume;
    public String name = "cube";

    public cube(double length){

        this.area = Math.pow(length,2)*6.00;
        this.volume = Math.pow(length,3);

    }

    @Override
    public double getVolume() {
        return volume;
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
