package exercice2.viewer;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class SeedTest {

    @Test
    public void addElements() {
    Seed mySeed = new Seed("Test1");
    Seed mySecondSeed = new Seed("FinalSeed");
    Seed myThirdSeed = new Seed("FinalSeed");
    Seed myFourthSeed = new Seed("FinalSeed");
    ArrayList<Seed>theSeedToBeTestted = new ArrayList<>();
    theSeedToBeTestted.add(mySeed);
    theSeedToBeTestted.add(mySecondSeed);
    theSeedToBeTestted.add(myThirdSeed);
    theSeedToBeTestted.add(myFourthSeed);

    mySeed.addElements(theSeedToBeTestted);
    assertEquals(myThirdSeed,mySeed.getElement(2));
    }

    @Test
    public void addElement() {
        Seed mySeed = new Seed("Test1");
        Seed mySecondSeed = new Seed("FinalSeed");
        mySecondSeed.addElement(mySeed);
        assertEquals(mySeed,mySecondSeed.getElement(0));
    }

    @Test
    public void getNbElements() {
        Seed mySeed = new Seed("Test1");
        Seed mySecondSeed = new Seed("FinalSeed");
        Seed myThirdSeed = new Seed("FinalSeed");
        Seed myFourthSeed = new Seed("FinalSeed");
        ArrayList<Seed>theSeedToBeTestted = new ArrayList<>();
        theSeedToBeTestted.add(mySeed);
        theSeedToBeTestted.add(mySecondSeed);
        theSeedToBeTestted.add(myThirdSeed);
        theSeedToBeTestted.add(myFourthSeed);

        mySeed.addElements(theSeedToBeTestted);
        assertEquals(4,mySeed.getNbElements());
    }

}
