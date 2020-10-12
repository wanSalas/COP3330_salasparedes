public class pyramid extends shape3D {

    public double area;
    public double volume;
    public String name = "pyramid";

    public pyramid(double length,double width,double height) {

        this.area = (length * width) +(Math.pow(height,2) + Math.pow((length/2),2)/width) + (Math.pow(height,2)+ Math.pow((width/2),2)/length);

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