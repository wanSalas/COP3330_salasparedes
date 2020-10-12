public class cube extends shape3D {

    public double Area;

    public cube(double length){

        this.Area = Math.pow(length,2)*6;

    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double getArea() {
        return Area;
    }
}
