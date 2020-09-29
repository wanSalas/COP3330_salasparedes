import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BodyMassIndexTest {
    @Test
    public void underWeight(){
        BodyMassIndex test1 =new BodyMassIndex(64,90);
        double exactBMI = test1.Average();
        String weight = test1.bmiCategory();
        assertEquals(15.4,exactBMI);
        assertEquals("YOU ARE UNDERWEIGHT",weight);

    }
    @Test
    public void normalWeight(){
        BodyMassIndex test2 =new BodyMassIndex(73,160);
        double exactBMI = test2.Average();
        String weight = test2.bmiCategory();
        assertEquals(21.1,exactBMI);
        assertEquals("YOU ARE NORMAL",weight);
    }
    @Test
    public void overWeight(){
        BodyMassIndex test3 =new BodyMassIndex(72,200);
        double exactBMI = test3.Average();
        String weight = test3.bmiCategory();
        assertEquals(15.2,exactBMI);
        assertEquals("YOU ARE OVERWEIGHT",weight);
    }
    @Test
    public void Obese(){
        BodyMassIndex test4 =new BodyMassIndex(86,320);
        double exactBMI = test4.Average();
        String weight = test4.bmiCategory();
        assertEquals(15.2,exactBMI);
        assertEquals("YOU ARE OBESE",weight);
    }
}
