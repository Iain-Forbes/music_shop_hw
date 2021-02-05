package Instruments;

import Stock.StockItems;
import behaviours.IPlay;

public abstract class Instrument extends StockItems implements IPlay {

    private String colour;
    private String type;
    private String make;

    public Instrument(String colour, String type, String make, String catagory, int PriceBought, int SellingPrice){
        super(catagory, PriceBought, SellingPrice);
        this.colour = colour;
        this.type = type;
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}
