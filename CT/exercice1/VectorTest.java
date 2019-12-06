import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    private double[] v;
    private double[] w;

    @Before
    public void initTest(){
        v = new double[]{2, 5};
        w = new double[]{3, 2};
    }

    @Test
    public void normTest(){
        double result = Vector.norm(v);
        double expected = 5.38516480713;
        assertEquals(expected, result, Math.pow(1, -10));
    }

    @Test
    public void scaleTest(){
        double[] result = Vector.scale(v, 2);
        double expected1 = 4;
        double expected2 = 10;
        assertEquals(expected1, result[0], 0);
        assertEquals(expected2, result[1], 0);
    }

    @Test
    public void normalizeTest(){
        double[] result = Vector.normalize(v);
        double expected1 = 2/5.38516480713;
        double expected2 = 10/5.38516480713;
        assertEquals(expected1, result[0], Math.pow(1, -10));
        assertEquals(expected2, result[1], Math.pow(1, -10));
    }

    @Test
    public void add(){
        double[] result = Vector.add(v, w);
        double expected1 = 5;
        double expected2 = 10;
        assertEquals(expected1, result[0], 0);
        assertEquals(expected2, result[1], 0);
    }

}
