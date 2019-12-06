package test;

import exercice1.Vector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class TestVector {

    @Test
    void testNorm() {
        Vector v = new Vector(3.0f,4.0f);
        float expected=  5.0f;

        float actual = v.norm();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testScale() {
        // Arrange
        int k = 2;
        Vector v = new Vector(3.0f,4.0f);
        int expectedOnX = 6;
        int expectedOnY = 8;

        //Act
        Vector w = v.scale(k);

        float actualOnX = w.getX();
        float actualOnY = w.getY();

        // Assert
        Assertions.assertEquals(expectedOnX, actualOnX);
        Assertions.assertEquals(expectedOnY, actualOnY);
    }

    @Test
    void testNormalize() {
        Vector v = new Vector(3.0f,4.0f);
        float expectedOnX = 3.0f / 5.0f;
        float expectedOnY = 4.0f / 5.0f;

        // Act
        Vector w  = v.normalize();

        // Assert
        Assertions.assertEquals(expectedOnX, w.getX());
        Assertions.assertEquals(expectedOnY, w.getY());
    }

    @Test
    void testAdd() {
        Vector v = new Vector(3.0f, 4.0f);
        Vector w = new Vector(1.0f, 1.0f);
        float expectedOnX = 4.0f;
        float expectedOnY = 5.0f;

        // Arrange
        Vector u = v.add(w);

        Assertions.assertEquals(expectedOnX, u.getX());
        Assertions.assertEquals(expectedOnY, u.getY());
    }
}
