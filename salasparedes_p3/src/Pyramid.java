public class Pyramid extends Shape3D {

    public double area;
    public double volume;
    public String name = "pyramid";

    public Pyramid(double length, double width, double height) {

        this.area = (length * width) + length * Math.sqrt(Math.pow((width/2.00),2) + Math.pow(height,2)) + width * Math.sqrt(Math.pow((length/2.00),2) + Math.pow(height,2));
        this.volume = (length*width*height)/3.00;

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