package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToyTest {

    @Test
    public void toyTest(){
        Toy toy = new Toy();
        toy.addElement(new Circle(1.0D));
        toy.addElement(new Triangle(6.0D, 2.5D));
        toy.addElement(new Rectangle(6.0D, 1.0D));
        double expected = (1.0D * 1.0D * Math.PI) + (6.0D * 2.5D * 0.5D) + (6.0D * 1.0D);
        assertEquals(expected, toy.getArea());
    }
}
