package exercice1;

import static org.junit.Assert.*;

public class VectorTest {
    @org.junit.Test
    public void norm() {
        double v[] = new double[2];
        v[0] = 5.6;
        v[1] = 60.4;
        assertEquals(Math.sqrt((v[0]*v[0])+(v[1]*v[1])),Vector.norm(v),0);
    }

    @org.junit.Test
    public void scale() {
        double x[] = new double[2];
        x[0] = 6.4;
        x[1] = 7.9;
        double z[] = new double[2];
        z[0] = x[0] * 6;
        z[1] = x[1] * 6;
        assertArrayEquals(z,Vector.scale(x,6),0);
    }

    @org.junit.Test
    public void normalize() {
        double[] vNormalized = new double[2];
        double[] v = new double[2];
        double[] vExpected = new double[2];
        v[0] = 64.0;
        v[1] = 69.0;
        vNormalized[0] = v[0]/Vector.norm(v);
        vNormalized[1] = v[1]/Vector.norm(v);
        assertArrayEquals(vNormalized, Vector.normalize(v),0);
    }

    @org.junit.Test
    public void add() {
        double[] z = new double[2];
        double[] v = new double[2];
        double[] w = new double[2];
        v[0] = 64.0;
        v[1] = 69.0;
        w[0] = 64.0;
        w[1] = 69.0;
        z[0] = v[0] + w[0];
        z[1] = v[1] + w[1];
        assertArrayEquals(z, Vector.add(v,w),0);
    }
}
