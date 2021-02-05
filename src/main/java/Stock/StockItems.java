package Stock;

import behaviours.ISell;


public abstract class StockItems implements ISell {

    private int priceBought;
    private String catagory;
    private int sellingPrice;

    public StockItems(String catagory, int priceBought, int sellingPrice){
        this.catagory = catagory;
        this.priceBought = priceBought;
        this.sellingPrice = sellingPrice;
    }

    public String getCatagory() {
        return this.catagory;
    }

    public int getPriceBought() {
        return this.priceBought;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }


}
