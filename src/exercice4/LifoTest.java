package exercice4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LifoTest {

    @Test
    public void QueueLIFOUnit() throws Exception {
        Lifo lifo = new Lifo(10);
        lifo.push(5);
        lifo.push(7);
        lifo.push(1);
        assertEquals(1, lifo.pop());
        assertEquals(7, lifo.pop());
        assertEquals(5, lifo.pop());
    }

    @Test
    public void LifoFullException() throws Exception {
        Lifo lifo = new Lifo(10);
        for (int i = 0; i < lifo.getArray().length + 1; i++){
            if(i == lifo.getArray().length){
                assertThrows(Exception.class, ()->{lifo.push(1);});
            } else {
                lifo.push(1);
            }
        }
    }

    @Test
    public void LifoEmptyException() throws Exception {
        Lifo lifo = new Lifo(10);
        assertThrows(Exception.class, ()->{lifo.pop();});
    }
}
