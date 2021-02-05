import Instruments.Guitar;
import Stock.StockItems;
import behaviours.ISell;
import java.util.ArrayList;

public class Shop {

    private String name;
    private int totalCash;
    private ArrayList<ISell> stocks;


    public Shop(String name, int totalCash) {
        this.name = name;
        this.totalCash = totalCash;
        this.stocks = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public int getStockCount(){
        return stocks.size();
    }

    public void addStock(ISell stock) {
        stocks.add(stock);
    }

    public void removeStock(){
        stocks.clear();
    }

    public int sellStock(){
        int total = 0;
        for(ISell stock : stocks){
            total += stock.calcualteMarkup();


        };
        return this.totalCash = total + this.totalCash;
    }
}
