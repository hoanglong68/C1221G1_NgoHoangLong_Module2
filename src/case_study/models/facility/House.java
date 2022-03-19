package case_study.models.facility;


import java.util.Objects;

public class House extends Facility {
    private String standardOfRoom;
    private int floors;
    private String idHouse;

    public House() {
    }

    public House(String idHouse, String nameService, double area, int price, int capacity, String rentStyle,
                 String standardOfRoom, int floors) {
        super(idHouse,nameService, area, price, capacity, rentStyle);
        this.idHouse = idHouse;
        this.standardOfRoom = standardOfRoom;
        this.floors = floors;
        this.idHouse = idHouse;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    @Override
    public String toConvert() {
        return
                idHouse + COMMA +
                        super.toConvert() + COMMA +
                        standardOfRoom + COMMA +
                        floors
                ;
    }

    @Override
    public String toString() {
        return "House{" +
                "idHouse='" + idHouse + '\'' +
                super.toString() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", floors=" + floors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return idHouse.equals(house.idHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHouse);
    }
}
