package homework_chanh_file.models;

public class Truck extends Vehicle {
    private int deadWeight;

    public Truck() {
    }

    public Truck(String numberPlate, String nameOfManufacture, int yearOfManufacture, String owner, int deadWeight) {
        super(numberPlate, nameOfManufacture, yearOfManufacture, owner);
        this.deadWeight = deadWeight;
    }

    public int getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(int deadWeight) {
        this.deadWeight = deadWeight;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "deadWeight=" + deadWeight +
                '}';
    }
}
