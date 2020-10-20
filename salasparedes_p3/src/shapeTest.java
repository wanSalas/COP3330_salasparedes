import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class shapeTest {

    @Test
    public void testName(){
        Shape shape = new Square(10);
        assertEquals("square", shape.getName());
    }

    @Test
    public void testSquareArea(){
        Shape2D shape = new Square(10);
        assertEquals(100, shape.getArea());
    }

    @Test

    public void testSquareArea2(){
        Shape2D shape = new Square(.5);
        assertEquals(.25, shape.getArea());
    }

    @Test
    public void triangleName(){
        Shape shape = new Triangle(100,100);
        assertEquals("triangle", shape.getName());
    }

    @Test
    public void triangleArea(){
        Shape2D shape = new Triangle(10,10);
        assertEquals(50, shape.getArea());
    }

    @Test
    public void triangleArea2(){
        Shape2D shape = new Triangle(0.5,0.25);
        assertEquals(0.063, shape.getArea(),0.001 );
    }

    @Test
    public void circleName(){
        Shape shape = new Circle(10);
        assertEquals("circle", shape.getName());
    }

    @Test
    public void circleArea(){
        Shape2D shape = new Circle(10);
        assertEquals(314.16, shape.getArea(),0.01 );
    }

    @Test
    public void circleArea2(){
        Shape2D shape = new Circle(0.5);
        assertEquals(0.79, shape.getArea(),0.01 );
    }

    @Test
    public void cubeName(){
        Shape shape = new Cube(10);
        assertEquals("cube", shape.getName());
    }

    @Test
    public void cubeArea(){
        Shape3D shape = new Cube(10);
        assertEquals(600, shape.getArea());
    }

    @Test
    public void cubeArea2(){
        Shape3D shape = new Cube(0.5);
        assertEquals(1.5, shape.getArea());
    }

    @Test
    public void cubeVolume(){
        Shape3D shape = new Cube(10);
        assertEquals(1000, shape.getVolume());
    }

    @Test
    public void cubeVolume2(){
        Shape3D shape = new Cube(0.5);
        assertEquals(0.13, shape.getVolume(),0.01);
    }

    @Test
    public void pyramidName(){
        Shape shape = new Pyramid(10,10,10);
        assertEquals("pyramid", shape.getName());
    }

    @Test
    public void pyramidArea(){
        Shape3D shape = new Pyramid(10,10,10);
        assertEquals(323.61, shape.getArea(),0.01);
    }

    @Test
    public void pyramidArea2(){
        Shape3D shape = new Pyramid(5,10,15);
        assertEquals(281.13, shape.getArea(),0.01);
    }

    @Test
    public void pyramidVolume(){
        Shape3D shape = new Pyramid(10,10,10);
        assertEquals(333.33, shape.getVolume(),0.01);
    }

    @Test
    public void pyramidVolume2(){
        Shape3D shape = new Pyramid(1.5,.5,2.5);
        assertEquals(0.63, shape.getVolume(),0.01);
    }

    @Test
    public void sphereName(){
        Shape shape = new Sphere(10);
        assertEquals("sphere", shape.getName());
    }

    @Test
    public void sphereArea(){
        Shape3D shape = new Sphere(10);
        assertEquals(1256.64, shape.getArea(),0.01);
    }

    @Test
    public void sphereArea2(){
        Shape3D shape = new Sphere(0.75);
        assertEquals(7.07, shape.getArea(),0.01);
    }

    @Test
    public void sphereVolume(){
        Shape3D shape = new Sphere(10);
        assertEquals(4188.79, shape.getVolume(),0.01);
    }

    @Test
    public void sphereVolume2(){
        Shape3D shape = new Sphere(0.6);
        assertEquals(0.9, shape.getVolume(),0.1);
    }
}