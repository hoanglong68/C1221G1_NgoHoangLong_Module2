package case_study.models.facility;


public class Villa extends Facility {
    private String standardOfRoom;
    private int poolArea;

    public Villa() {
    }

    public Villa(String nameService, int area, int price, int capacity, String rentStyle, String standardOfRoom, int poolArea) {
        super(nameService, area, price, capacity, rentStyle);
        this.standardOfRoom = standardOfRoom;
        this.poolArea = poolArea;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", poolArea=" + poolArea +
                '}';
    }
}
