package Instruments;

public class Piano extends Instrument {

    private boolean hasMusicStand;

    public Piano(String colour, String type, String make, String catagory, int PriceBought, int SellingPrice, boolean hasMusicStand) {
        super(colour, type, make, catagory, PriceBought, SellingPrice);
        this.hasMusicStand = hasMusicStand;
    }

    public String instrumentSound() {
        return "Clannnnng!";
    }

    public int calculateMarkup() {
        return  this.getSellingPrice() - this.getPriceBought();
    }

    public boolean isHasMusicStand() {
        return hasMusicStand;
    }
}
