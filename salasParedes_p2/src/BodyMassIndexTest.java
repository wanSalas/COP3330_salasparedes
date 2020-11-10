import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BodyMassIndexTest {
    @Test
    public void underWeight(){
        BodyMassIndex test1 =new BodyMassIndex(64.00,90.00);
        double exactBMI = test1.Average();
        String weight = test1.bmiCategory();
        assertEquals(15.4, test1.Average());
        assertEquals("YOU ARE UNDERWEIGHT",weight);

    }
    @Test
    public void normalWeight(){
        BodyMassIndex test2 = new BodyMassIndex(73.00,160.00);
        double exactBMI = test2.Average();
        assertEquals(21.1,exactBMI);
        String weight = test2.bmiCategory();
        assertEquals("YOU ARE NORMAL",weight);
    }
    @Test
    public void overWeight(){
        BodyMassIndex test3 =new BodyMassIndex(72.00,200.00);
        double exactBMI = test3.Average();
        String weight = test3.bmiCategory();
        assertEquals(15.2,exactBMI);
        assertEquals("YOU ARE OVERWEIGHT",weight);
    }
    @Test
    public void Obese(){
        BodyMassIndex test4 =new BodyMassIndex(86.00,320.00);
        double exactBMI = test4.Average();
        String weight = test4.bmiCategory();
        assertEquals(15.2,exactBMI);
        assertEquals("YOU ARE OBESE",weight);
    }
}
