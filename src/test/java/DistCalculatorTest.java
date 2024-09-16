import static org.junit.Assert.*;
import org.junit.Test;

public class DistCalculatorTest {

    @Test
    public void testCalculateDistance() {
        // Test case 1: Points (3, 4) and (7, 1) should return distance of 5.0
        double result = DistCalculator.calculateDistance(3.0, 4.0, 7.0, 1.0);
        assertEquals(5.0, result, 0.001);  // Allow small delta for floating-point precision

        // Test case 2: Points (0, 0) and (0, 0) should return distance of 0.0
        result = DistCalculator.calculateDistance(0.0, 0.0, 0.0, 0.0);
        assertEquals(0.0, result, 0.001);

        // Test case 3: Points (-1, -1) and (1, 1) should return distance of 2.828
        result = DistCalculator.calculateDistance(-1.0, -1.0, 1.0, 1.0);
        assertEquals(2.828, result, 0.001);
    }
}
