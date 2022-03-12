package homework_chanh_file.models;

public class Car extends Vehicle {
    private int numberOfSeat;
    private String carType;
    private static final String COMMA = ",";
    public Car() {
    }

    public Car(String numberPlate, String nameOfManufacture, int yearOfManufacture, String owner, int numberOfSeat, String carType) {
        super(numberPlate, nameOfManufacture, yearOfManufacture, owner);
        this.numberOfSeat = numberOfSeat;
        this.carType = carType;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA+
                numberOfSeat + COMMA+
                carType
                ;
    }
}
