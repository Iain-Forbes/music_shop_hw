package Instruments;


import Instruments.enums.guitarTypes;
import Stock.StockItems;

public class Guitar extends Instrument {

    private guitarTypes guitarType;

    public Guitar(String colour, String type, guitarTypes guitarType, String make, String catagory, int PriceBought, int SellingPrice) {
        super(colour, type, make, catagory, PriceBought, SellingPrice);
        this.guitarType = guitarType;
    }

    public guitarTypes getGuitarType() {
        return guitarType;
    }

    public String instrumentSound() {
        return "dee-Tzzzzuuuhhh";
    }

    public int calculateMarkup() {
        return  this.getSellingPrice() - this.getPriceBought();
    }

}
