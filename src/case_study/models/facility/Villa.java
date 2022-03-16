package case_study.models.facility;


public class Villa extends Facility {

    private String standardOfRoom, idVilla;
    private int poolArea;

    public Villa() {
    }

    public Villa(String idVilla, String nameService, int area, int price, int capacity, String rentStyle, String standardOfRoom, int poolArea) {
        super(nameService, area, price, capacity, rentStyle);
        this.idVilla = idVilla;
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

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    @Override
    public String toString() {
        return "Villa{"
                + "idVilla='" + idVilla + '\'' +
                super.toString() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", poolArea=" + poolArea +
                '}';
    }
}
