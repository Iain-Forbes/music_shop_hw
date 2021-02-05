import Instruments.Guitar;
import Instruments.Piano;
import Instruments.enums.guitarTypes;
import Stock.StockItems;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Shop shop1;
    Guitar guitar;
    Guitar guitar1;
    Piano piano;

    @Before
    public void setUp() {
        shop = new Shop("Gary's Guitar Garage", 1000);
        shop1 = new Shop("Pete's Piano Palace", 10000);
        guitar = new Guitar("Red", "String", guitarTypes.ACOUSTIC, "Gibson", "Guitar", 50, 150);
        guitar1 = new Guitar("Blue", "String", guitarTypes.ELECTRIC, "Fender", "Guitar", 300, 500);
        piano =  new Piano("Black", "Chordophone", "Bosendorfer","Keys", 400, 800, true);
    }

    @Test
    public void getName() {
        assertEquals("Gary's Guitar Garage", shop.getName());
    }

    @Test
    public void getTotalCash() {
        assertEquals(1000, shop.getTotalCash());
    }

    @Test
    public void canSetStock() {
        shop.addStock(guitar);
        shop.addStock(guitar1);
        shop.addStock(piano);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop1.addStock(guitar);
        shop1.removeStock();
        assertEquals(0, shop1.getStockCount());
    }

    @Test
    public void canSellStock() {
        shop.addStock(guitar);
        shop.addStock(guitar1);
        shop.sellStock();
        assertEquals(1300, shop.getTotalCash());
    }



}