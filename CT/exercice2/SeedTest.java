import exercice2.Seed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeedTest {

    private Seed seed;

    @Before
    public void initTest(){
        seed = new Seed("Test");
    }

    @Test
    public void addElementTest(){
        Seed element = new Seed("Element");
        seed.addElement(element);
        assertEquals(element, seed.getElement(0));
        assertEquals(1, seed.getNbElements());
    }

    @Test
    public void addElementsTest(){
        Seed[] elements = new Seed[]{
                new Seed("Element 1 "),
                new Seed("Element 2 "),
                new Seed("Element 3 ")
        };

        seed.addElements(elements);

        assertEquals(elements[0], seed.getElement(0));
        assertEquals(elements[1], seed.getElement(1));
        assertEquals(elements[2], seed.getElement(2));
        assertEquals(3, seed.getNbElements());
    }

    @Test
    public void testSerialize(){
        seed = Seed.createExample();
        System.out.println(seed.serialize());
    }
}
