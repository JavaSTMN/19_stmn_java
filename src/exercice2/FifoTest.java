package exercice2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FifoTest {

    @Test
    public void FifoUnitPush() throws Exception {
        Fifo fifo = new Fifo();
        fifo.init(10);
        fifo.push(5);
        fifo.push(7);
        fifo.push(1);
        assertEquals(5, fifo.pop());
        assertEquals(7, fifo.pop());
        assertEquals(1, fifo.pop());
    }

    @Test
    public void FifoFullException() throws Exception {
        Fifo fifo = new Fifo();
        fifo.init(10);
        for (int i = 0; i < fifo.array.length + 1; i++){
            if(i == fifo.array.length){
                assertThrows(Exception.class, ()->{fifo.push(1);});
            } else {
                fifo.push(1);
            }
        }
    }

    @Test
    public void FifoEmptyException() throws Exception {
        Fifo fifo = new Fifo();
        fifo.init(10);
        assertThrows(Exception.class, ()->{fifo.pop();});
    }
}
