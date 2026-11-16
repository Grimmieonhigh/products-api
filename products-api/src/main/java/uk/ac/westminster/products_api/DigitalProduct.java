package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double downloadSizeMB;
    private double discountedPrice;

    public DigitalProduct() {}

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double downloadSizeMB){
        super(id,name,price);
        this.downloadUrl = downloadUrl;
        this.downloadSizeMB = downloadSizeMB;
    }


    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getDownloadSizeMB() {
        return downloadSizeMB;
    }

    public String getSummary() {
        return "Digital: " + getName()
                + "| Download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
