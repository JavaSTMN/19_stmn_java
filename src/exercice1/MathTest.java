package exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MathTest {

    @Test
    public void testSommeCarre(){
        assertEquals(385, Math.sommeCarre(10));
    }

    @Test
    public void testCarreSomme(){
        assertEquals(3025, Math.carreSomme(10));
    }

    @Test
    public void testDifference(){
        int result = Math.carreSomme(100) - Math.sommeCarre(100);
        assertEquals(25164150, result);
    }

}
