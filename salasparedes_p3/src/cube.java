public class cube extends shape3D {

    public double area;
    public double volume;

    public cube(double length){

        this.area = Math.pow(length,2)*6;
        this.volume = Math.pow(length,3);

    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double getArea() {
        return area;
    }
}
