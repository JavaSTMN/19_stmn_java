package test;


import exercice2.viewer.Seed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSeed {

    @Test
    void testGetElement() {
        Seed[] elements = new Seed[] { new Seed("A"), new Seed("B"), new Seed("C")};
        Seed root = new Seed("Root", elements);

        // Arrange
        Seed seedA = root.getElement(0);
        Seed seedB = root.getElement(1);
        Seed seedC = root.getElement(2);

        // Assert
        Assertions.assertEquals("A", seedA.toString());
        Assertions.assertEquals("B", seedB.toString());
        Assertions.assertEquals("C", seedC.toString());
    }

    @Test
    void testAddElement() {
        Seed seed = new Seed("Root");
        Seed element = new Seed("Leaf");
        String expected = element.toString();

        // Act
        seed.addElement(element);
        String actual = seed.getElement(0).toString();

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSize() {
        Seed[] elements = new Seed[] { new Seed("A"), new Seed("B")};
        Seed root = new Seed("root", elements);
        int expected = 2;

        // Act
        int actual = root.getNbElements();

        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
