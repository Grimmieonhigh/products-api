package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double downloadSizeMB;

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
}
