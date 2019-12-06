package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class VectorTest {
    @Test
    void normTest() {
        Vector v = new Vector(3, 4);
        float expected = 5;
        float reality = v.norm(v);
        assertEquals(expected, reality);
    }

    void scaleTest() {
        Vector expected = new Vector(6, 6);
        Vector reality = new Vector(3,3);
        reality = reality.scale(reality, 2);
        float x_expected = expected.getX();
        float y_expected = expected.getY();
        float x_reality = reality.getX();
        float y_reality = reality.getY();

        assertEquals(x_expected, x_reality);
        assertEquals(y_expected, y_reality);
    }

    void normalizeTest() {
        Vector expected = new Vector(0.6f, 0.8f);
        Vector v = new Vector(3,4);
        Vector reality = v.normalize(v);
        float x_expected = expected.getX();
        float y_expected = expected.getY();
        float x_reality = reality.getX();
        float y_reality = reality.getY();

        assertEquals(x_expected, x_reality);
        assertEquals(y_expected, y_reality);
    }

    void addTest() {
        Vector expected = new Vector(5, 6);
        Vector v = new Vector(3,4);
        Vector w = new Vector(2,2);
        Vector reality = v.add(v, w);
        float x_expected = expected.getX();
        float y_expected = expected.getY();
        float x_reality = reality.getX();
        float y_reality = reality.getY();

        assertEquals(x_expected, x_reality);
        assertEquals(y_expected, y_reality);
    }
}