import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestSolution {
    @Test
    public void testCalculateCircleAreasAllCorrect() {

        assertArrayEquals(new double[]{78.5, 3.14, 75.36}, App.calculateArea(5, 1), 0.01);
    }
    @Test
    public void testCalculateCircleAreasR2moreR1() {

        assertArrayEquals(new double[]{78.5, 3.14, 75.36}, App.calculateArea(1, 5), 0.01);
    }
    @Test
    public void testCalculateCircleAreasUsingThePoint() {
        assertArrayEquals(new double[]{78.5, 3.14, 75.36}, App.calculateArea(5.0, 1.0), 0.01);
    }

    @Test
    public void testCalculateCircleAreasAnCorrect() {

        assertArrayEquals(new double[]{89, 14, 4.36}, App.calculateArea(5, 1), 0.01);
    }

    @Test
    public void testCalculateTriangleParametersAllCorrect() {
        assertArrayEquals(new double[]{12.39, 5.01}, App.calculateTriangleParameters(0, 0, 2, 5, 0, 5), 0.01);
    }

    @Test
    public void testCalculateExpressionAllCorrect() {
        assertEquals(0.733, App.CalculateExpressionResult( 0.9, 90), 0.0001);
    }
}

