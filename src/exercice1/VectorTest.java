package exercice1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VectorTest {

    @org.junit.jupiter.api.Test
    static void testNorm(){
        Vector vec = new Vector();
        double v[]={2,2};
        double w[]={2,2};
        vec.setV(v);
        vec.setW(w);
        double norm=vec.norm();
        double expected = 2.0;
        assertEquals(expected,norm);
    }

    @org.junit.jupiter.api.Test
    static void testScale(){
        Vector vec = new Vector();
        double v[]={2,2};
        vec.setV(v);
        double scale[]=vec.scale(2);
        double expected[] = {4.0,4.0};
        assertEquals(expected,scale);
    }

    @org.junit.jupiter.api.Test
    static void testNormalize(){
        Vector vec = new Vector();
        double v[]={2,2};
        double w[]={2,2};
        vec.setV(v);
        vec.setW(w);
        double res[]=vec.normalize();
        double expected[] = {1.0,1.0};
        assertEquals(expected,res);
    }

    @org.junit.jupiter.api.Test
    static void testAdd(){
        Vector vec = new Vector();
        double v[]={2,2};
        double w[]={2,2};
        vec.setV(v);
        vec.setW(w);
        double res[]=vec.add();
        double expected[] = {4.0,4.0};
        assertEquals(expected,res);
    }

}