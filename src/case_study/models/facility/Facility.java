package case_study.models.facility;

public abstract class Facility {
    private String nameService, rentStyle;
    private double area;
    private int price, capacity;
    protected static final String COMMA = ",";
    private String idFacility;

    public Facility() {
    }

    public Facility(String idFacility, String nameService, double area, int price, int capacity, String rentStyle) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.capacity = capacity;
        this.rentStyle = rentStyle;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toConvert() {
        return
                nameService + COMMA +
                        area + COMMA +
                        price + COMMA +
                        capacity + COMMA +
                        rentStyle
                ;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                        ", area=" + area +
                        ", price=" + price +
                        ", rentStyle='" + rentStyle + '\'' +
                        ", capacity=" + capacity
                ;
    }
}
