package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FifoTest {

    @Test
    public void FifoUnit() throws Exception {
        Fifo fifoObject = new Fifo(10);
        fifoObject.push(5);
        fifoObject.push(7);
        fifoObject.push(1);
        assertEquals(5, fifoObject.pop());
        assertEquals(7, fifoObject.pop());
        assertEquals(1, fifoObject.pop());
    }

    @Test
    public void FifoFullException() throws Exception {
        Fifo fifoObject = new Fifo(10);
        for (int i = 0; i < fifoObject.getArray().length + 1; i++){
            if(i == fifoObject.getArray().length){
                assertThrows(Exception.class, ()->{fifoObject.push(1);});
            } else {
                fifoObject.push(1);
            }
        }
    }

    @Test
    public void FifoEmptyException() throws Exception {
        Fifo fifoObject = new Fifo(10);
        assertThrows(Exception.class, ()->{fifoObject.pop();});
    }
}
