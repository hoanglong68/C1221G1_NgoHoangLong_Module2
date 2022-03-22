package de_3.models;

public class ExportProduct extends Product {
    private double priceExport;
    private String countryExport;

    public ExportProduct() {
    }

    public ExportProduct(String codeProduct, String nameProduct, double price, int quantity, String manufacturer,
                         double priceExport, String countryExport) {
        super(codeProduct, nameProduct, price, quantity, manufacturer);
        this.priceExport = priceExport;
        this.countryExport = countryExport;
    }

    public ExportProduct(int idProduct, String codeProduct, String nameProduct, double price, int quantity, String manufacturer,
                         double priceExport, String countryExport) {
        super(idProduct, codeProduct, nameProduct, price, quantity, manufacturer);
        this.priceExport = priceExport;
        this.countryExport = countryExport;
    }

    public double getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(double priceExport) {
        this.priceExport = priceExport;
    }

    public String getCountryExport() {
        return countryExport;
    }

    public void setCountryExport(String countryExport) {
        this.countryExport = countryExport;
    }

    @Override
    public String toString() {
        return "ExportProduct{" + super.toString() +
                ", priceExport=" + priceExport +
                ", countryExport='" + countryExport + '\'' +
                '}';
    }

    @Override
    public String toCsv() {
        return super.toCsv() + COMMA +
                priceExport + COMMA +
                countryExport
                ;
    }
}
