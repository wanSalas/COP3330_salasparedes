import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShapeTest {

    @Test
    public void testName(){
        shape shape = new Square(10);
        assertEquals("square", shape.getName());
    }

    @Test
    public void testSquareArea(){
        shape2D shape = new Square(10);
        assertEquals(100, shape.getArea());
    }

    @Test

    public void testSquareArea2(){
        shape2D shape = new Square(.5);
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
    public void cubeArea(){
        shape3D shape = new Cube(10);
        assertEquals(600, shape.getArea());
    }

    @Test
    public void sphereName(){
        shape shape = new sphere(10);
        assertEquals("sphere", shape.getName());
    }
    @Test
    public void pyramidName(){
        shape shape = new pyramid(10,10,10);
        assertEquals("pyramid", shape.getName());
    }

}
`