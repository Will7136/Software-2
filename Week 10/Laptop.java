package SumWeek1;

public class Laptop {
    private String barcode;
    private String brand;
    private String model;
    private int ram;
    private int ssd;
    private int price;

    static final String BRAND = "brand";
    static final String MODEL = "model";
    static final String RAM = "ram";
    static final String SSD = "ssd";
    static final String PRICE = "price";

    
    public Laptop(String newBarcode, String newBrand, String newModel, int newRam, int newSsd, int newPrice){
        barcode = newBarcode;
        brand = newBrand;
        model = newModel;
        ram = newRam;
        ssd = newSsd;
        price = newPrice;
    }

    public String getBarcode() {
        return barcode;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public int getRam() {
        return ram;
    }
    public int getSsd() {
        return ssd;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String toString(){
        return("barcode = " + barcode +  ", brand = " + brand + ", model = " + 
        model + ", ram = " + Integer.toString(ram) + ", ssd capacity = " + Integer.toString(ssd) + 
        ", price = " + Integer.toString(price));
    }

}
