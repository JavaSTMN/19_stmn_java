/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import com.exercice1.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mehdi
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void TestScale() {
        Vector v = new Vector(1, 1);
        Vector w = new Vector(2, 2);
        assertEquals(w.v1, v.scale(2).v1);
        assertEquals(w.v2, v.scale(2).v2);
    }

    
    @Test
    public void TestNormalize() {
        Vector v = new Vector(1, 1);
        Vector w;
        float w1 = (float) (1 / java.lang.Math.sqrt(2));
        float w2 = (float) (1 / java.lang.Math.sqrt(2));
        w = new Vector(w1, w2);

        assertEquals(w1, v.normalize().v1);
        assertEquals(w2, v.normalize().v2);

    }
    
    @Test
    public void TestAdd() {
        Vector v = new Vector(1,1);
        Vector w = new Vector(1,1);
        Vector x = new Vector(2,2);
        
        assertEquals(x.v1,v.add(w).v1);
        assertEquals(x.v2,v.add(w).v2);
    }

    
}
