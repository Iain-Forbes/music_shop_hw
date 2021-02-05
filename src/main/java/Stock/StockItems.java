package Stock;

import behaviours.ISell;


public abstract class StockItems implements ISell {

    private int priceBought;
    private String category;
    private int sellingPrice;

    public StockItems(String category, int priceBought, int sellingPrice){
        this.category = category;
        this.priceBought = priceBought;
        this.sellingPrice = sellingPrice;
    }

    public String getCategory() {
        return this.category;
    }

    public int getPriceBought() {
        return this.priceBought;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }


}
