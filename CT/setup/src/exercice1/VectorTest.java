package exercice1;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {


    @org.junit.jupiter.api.Test
    void testNorm() {
        Vector v = new Vector(5,12);
        float vNorm = v.norm();
        assertEquals(13,vNorm);
    }

    @org.junit.jupiter.api.Test
    void scale() {
        Vector v = new Vector(2,2);
        Vector w = v.scale(3);

        Vector expected = new Vector(6,6);
        assertEquals(expected.getX(),w.getX());
        assertEquals(expected.getY(),w.getY());
    }

    @org.junit.jupiter.api.Test
    void normalize() {
        Vector v = new Vector(3,4);
        Vector vNormalized = v.normalize(v);

        Vector expected = new Vector(0.6f,0.8f);
        assertEquals(expected.getX(),vNormalized.getX());
        assertEquals(expected.getY(),vNormalized.getY());
    }

    @org.junit.jupiter.api.Test
    void add() {
        Vector v = new Vector(2,2);
        Vector w = new Vector(3,3);

        Vector x = new Vector(0,0);
        x.add(v,w);
        Vector expected = new Vector(5,5);

        assertEquals(expected.getX(),x.getX());
        assertEquals(expected.getY(),x.getY());
    }
}