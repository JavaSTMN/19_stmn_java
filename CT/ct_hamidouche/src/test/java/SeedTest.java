/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
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
public class SeedTest {

    public SeedTest() {
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
    public void testaddelement() {
        Seed racine = new Seed("racine");
        Seed seed1 = new Seed("seed1");
        
        assertEquals(0,racine.getNbElements());
        racine.addElement(seed1);
        assertEquals(1,racine.getNbElements());

    }
    
    
    @Test
    public void testAddElements() {
        
        Seed racine = new Seed("racine");
        Seed seed1 = new Seed("seed1");
        Seed seed2 = new Seed("seed2");
        
        List<Seed> seeds =  new ArrayList();
        seeds.add(seed1);
        seeds.add(seed2);
        
        assertEquals(0,racine.getNbElements());
        racine.addElements(seeds);
        assertEquals(2,racine.getNbElements());
        
    }
    
    @Test
    public void testGetElement(){
        
        Seed racine = new Seed("racine");
        Seed seed1 = new Seed("seed1");
        Seed seed2 = new Seed("seed2");
        
        racine.addElement(seed1);
        racine.addElement(seed2);

        assertEquals("seed2",racine.getElement(1).toString());
        
    }

}
