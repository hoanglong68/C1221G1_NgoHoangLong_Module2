package case_study.models.facility;


public class House extends Facility {
    private String standardOfRoom;
    private int floors;

    public House() {
    }

    public House(String nameService, int area, int price, int capacity, String rentStyle, String standardOfRoom, int floors) {
        super(nameService, area, price, capacity, rentStyle);
        this.standardOfRoom = standardOfRoom;
        this.floors = floors;
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

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", floors=" + floors +
                '}';
    }
}
