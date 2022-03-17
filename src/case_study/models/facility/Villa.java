package case_study.models.facility;


import java.util.Objects;

public class Villa extends Facility {

    private String standardOfRoom, idVilla;
    private double poolArea;

    public Villa() {
    }

    public Villa(String idVilla, String nameService, double area, int price, int capacity, String rentStyle,
                 String standardOfRoom, double poolArea) {
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    @Override
    public String toConvert() {

        return idVilla + COMMA +
                super.toConvert() + COMMA +
                standardOfRoom + COMMA +
                poolArea
                ;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return idVilla.equals(villa.idVilla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVilla);
    }
}
