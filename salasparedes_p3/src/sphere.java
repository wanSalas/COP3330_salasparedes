public class sphere extends shape3D {

    public double area;
    public double volume;
    public String name = "sphere";

    public sphere(double Radius){
        // math
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
