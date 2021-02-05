package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano =  new Piano("Black", "Chordophone", "Bosendorfer","Keys", 400, 800, true);
    }

    @Test
    public void getColour() {
            assertEquals("Black", piano.getColour());
    }

    @Test
    public void getType() {
        assertEquals("Chordophone", piano.getType());
    }

    @Test
    public void getMake() {
        assertEquals("Bosendorfer", piano.getMake());
    }

    @Test
    public void getCatagory() {
        assertEquals("Keys", piano.getCatagory());
    }

    @Test
    public void getPriceBought() {
        assertEquals(400, piano.getPriceBought());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(800, piano.getSellingPrice());
    }

    @Test
    public void instrumentSound() {
        assertEquals("Clannnnng!", piano.instrumentSound());
    }

    @Test
    public void calcualteMarkup(){
        assertEquals(400, piano.calcualteMarkup());
    }

    @Test
    public void isHasMusicStand() {
        assertTrue(piano.isHasMusicStand());
    }
}