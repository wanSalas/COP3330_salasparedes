public class Sphere extends Shape3D {

    public double area;
    public double volume;
    public String name = "sphere";

    public Sphere(double radius){

        // area is 4(pi)r^2
        // volume is (4/3)(pi)r^3
        this.area = 4.00 * Math.PI * Math.pow(radius,2);
        this.volume = (4.00/3.00)*(Math.PI)*(Math.pow(radius,3));

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
