package case_study.models.facility;

public abstract class Facility {
    private String nameService, rentStyle;
    private int area, price, capacity;

    public Facility() {
    }

    public Facility(String nameService, int area, int price, int capacity, String rentStyle) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.capacity = capacity;
        this.rentStyle = rentStyle;
    }

//    public String getIdFacility() {
//        return idFacility;
//    }
//
//    public void setIdFacility(String idFacility) {
//        this.idFacility = idFacility;
//    }

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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
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

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                ", rentStyle='" + rentStyle + '\'' +
//                ", idFacility='" + idFacility + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", capacity=" + capacity
                ;
    }
}
