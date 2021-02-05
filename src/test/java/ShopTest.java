import Instruments.Guitar;
import Instruments.enums.guitarTypes;
import Stock.StockItems;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Guitar guitar1;

    @Before
    public void setUp() {
        shop = new Shop("Gary's Guitar Garage", 1000);
        guitar = new Guitar("Red", "String", guitarTypes.ACOUSTIC, "Gibson", "Guitar", 50, 150);
        guitar1 = new Guitar("Blue", "String", guitarTypes.ELECTRIC, "Fender", "Guitar", 300, 500);
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
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar);
        shop.removeStock();
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canSellStock() {
        shop.addStock(guitar);
        shop.addStock(guitar1);
        shop.sellStock();
        assertEquals(1300, shop.getTotalCash());
    }



}