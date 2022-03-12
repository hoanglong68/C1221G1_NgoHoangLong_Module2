package homework_chanh_file.models;

public class MotorBike extends Vehicle {
    private int wattage;
    private static final String COMMA = ",";

    public MotorBike() {
    }

    public MotorBike(String numberPlate, String nameOfManufacture, int yearOfManufacture, String owner, int wattage) {
        super(numberPlate, nameOfManufacture, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA +
                wattage
                ;
    }
}
