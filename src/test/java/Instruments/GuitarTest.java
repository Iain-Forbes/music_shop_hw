package Instruments;

import Instruments.enums.guitarTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Red", "String", guitarTypes.ACOUSTIC, "Gibson", "Guitar", 50, 150);
    }

    @Test
    public void getColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void getGuitarType() {
        assertEquals(guitarTypes.ACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void getMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void instrumentSound() {
        assertEquals("dee-Tzzzzuuuhhh", guitar.instrumentSound());
    }

    @Test
    public void getPriceBought() {
        assertEquals(50, guitar.getPriceBought());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(150, guitar.getSellingPrice());
    }

    @Test
    public void calcualteMarkup() {
        assertEquals(100, guitar.calcualteMarkup());
    }
}