package homework_chanh_file.models;

public class MotorBike extends Vehicle {
    private int wattage;

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
        return "MoToBike{" + super.toString() +
                "wattage=" + wattage +
                '}';
    }
}
