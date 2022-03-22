package de_3.models;

public class ImportProduct extends Product {
    private double priceImport;
    private String importProvince;
    private double taxImport;

    public ImportProduct() {
    }

    public ImportProduct(String codeProduct, String nameProduct, double price, int quantity, String manufacturer,
                         double priceImport, String importProvince, double taxImport) {
        super(codeProduct, nameProduct, price, quantity, manufacturer);
        this.priceImport = priceImport;
        this.importProvince = importProvince;
        this.taxImport = taxImport;
    }

    public ImportProduct(int idProduct, String codeProduct, String nameProduct, double price, int quantity, String manufacturer,
                         double priceImport, String importProvince, double taxImport) {
        super(idProduct, codeProduct, nameProduct, price, quantity, manufacturer);
        this.priceImport = priceImport;
        this.importProvince = importProvince;
        this.taxImport = taxImport;
    }

    public double getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(double priceImport) {
        this.priceImport = priceImport;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(double taxImport) {
        this.taxImport = taxImport;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString() +
                ", priceImport=" + priceImport +
                ", ImportProvince='" + importProvince + '\'' +
                ", taxImport=" + taxImport +
                '}';
    }

    @Override
    public String toCsv() {
        return super.toCsv() + COMMA +
                priceImport + COMMA +
                importProvince + COMMA +
                taxImport
                ;
    }
}
