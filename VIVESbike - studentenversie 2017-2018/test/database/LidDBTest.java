/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import databag.Lid;
import datatype.Geslacht;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import datatype.Rijksregisternummer;
import java.time.LocalDate;

/**
 *
 * @author Lars
 */
public class LidDBTest {
    
    private Lid lid;
    
    public LidDBTest() {
    }

    @Before
    public void setUp() throws Exception{
        lid = new Lid();
        Rijksregisternummer rijksregisternummer = new Rijksregisternummer("97092258579");
        lid.setRijksregisternummer(rijksregisternummer);
        lid.setVoornaam("Florian");
        lid.setNaam("Bertrand");
        lid.setGeslacht(Geslacht.M);
        lid.setTelnr("0474574584");
        lid.setEmailadres("florian.bertrand@hotmail.com");
        lid.setStart_lidmaatschap(LocalDate.now());
        
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toevoegenLid method, of class LidDB.
     */
    @Test
    public void testToevoegenLid() throws Exception {
        LidDB instance = new LidDB();
        instance.toevoegenLid(lid);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of wijzigenLid method, of class LidDB.
     */
    @Test
    public void testWijzigenLid() {
        System.out.println("wijzigenLid");
        Lid lid = null;
        LidDB instance = new LidDB();
        instance.wijzigenLid(lid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uitschrijvenLid method, of class LidDB.
     */
    @Test
    public void testUitschrijvenLid() {
        System.out.println("uitschrijvenLid");
        String rr = "";
        LidDB instance = new LidDB();
        instance.uitschrijvenLid(rr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zoekLid method, of class LidDB.
     */
    @Test
    public void testZoekLid() {
        System.out.println("zoekLid");
        String rijksregisternummer = "";
        LidDB instance = new LidDB();
        Lid expResult = null;
        Lid result = instance.zoekLid(rijksregisternummer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zoekAlleLeden method, of class LidDB.
     */
    @Test
    public void testZoekAlleLeden() {
        System.out.println("zoekAlleLeden");
        LidDB instance = new LidDB();
        ArrayList<Lid> expResult = null;
        ArrayList<Lid> result = instance.zoekAlleLeden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
