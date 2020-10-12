import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class shapeTest {

    @Test
    public void testName(){
        shape shape = new square(10);
        assertEquals("square", shape.getName());
    }

    @Test
    public void testSquareArea(){
        shape2D shape = new square(10);
        assertEquals(100, shape.getArea());
    }

    @Test

    public void testSquareArea2(){
        shape2D shape = new square(.5);
        assertEquals(.25, shape.getArea());
    }

    @Test
    public void triangleName(){
        shape shape = new triangle(100,100);
        assertEquals("triangle", shape.getName());
    }

    @Test
    public void triangleArea(){
        shape2D shape = new triangle(10,10);
        assertEquals(50, shape.getArea());
    }

    @Test
    public void triangleArea2(){
        shape2D shape = new triangle(0.5,0.25);
        assertEquals(0.063, shape.getArea(),0.001 );
    }

    @Test
    public void circleName(){
        shape shape = new circle(10);
        assertEquals("circle", shape.getName());
    }

    @Test
    public void circleArea(){
        shape2D shape = new circle(10);
        assertEquals(314.16, shape.getArea(),0.01 );
    }

    @Test
    public void circleArea2(){
        shape2D shape = new circle(0.5);
        assertEquals(0.79, shape.getArea(),0.01 );
    }

    @Test
    public void cubeName(){
        shape shape = new cube(10);
        assertEquals("cube", shape.getName());
    }

    @Test
    public void cubeArea(){
        shape3D shape = new cube(10);
        assertEquals(600, shape.getArea());
    }

    @Test
    public void cubeArea2(){
        shape3D shape = new cube(0.5);
        assertEquals(1.5, shape.getArea());
    }

    @Test
    public void cubeVolume(){
        shape3D shape = new cube(10);
        assertEquals(1000, shape.getVolume());
    }

    @Test
    public void cubeVolume2(){
        shape3D shape = new cube(0.5);
        assertEquals(0.13, shape.getVolume(),0.01);
    }

    @Test
    public void pyramidName(){
        shape shape = new pyramid(10,10,10);
        assertEquals("pyramid", shape.getName());
    }

    /*@Test
    public void pyramidArea(){
        shape3D shape = new pyramid(10,10,10);
        assertEquals(323.61, shape.getArea(),0.01);
    }*/

    @Test
    public void sphereName(){
        shape shape = new sphere(10);
        assertEquals("sphere", shape.getName());
    }

    @Test
    public void sphereArea(){
        shape3D shape = new sphere(10);
        assertEquals(1256.64, shape.getArea(),0.01);
    }

    @Test
    public void sphereArea2(){
        shape3D shape = new sphere(0.75);
        assertEquals(7.07, shape.getArea(),0.01);
    }

    @Test
    public void sphereVolume(){
        shape3D shape = new sphere(10);
        assertEquals(4188.79, shape.getVolume(),0.01);
    }

    @Test
    public void sphereVolume2(){
        shape3D shape = new sphere(0.6);
        assertEquals(0.9, shape.getVolume(),0.1);
    }
}