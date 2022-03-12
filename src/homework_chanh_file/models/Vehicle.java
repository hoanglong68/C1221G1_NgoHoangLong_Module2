package homework_chanh_file.models;

public abstract class Vehicle {
    private int yearOfManufacture;
    private String numberPlate, nameOfManufacture, owner;
    private static final String COMMA = ",";

    public Vehicle() {
    }

    public Vehicle(String numberPlate, String nameOfManufacture, int yearOfManufacture, String owner) {
        this.yearOfManufacture = yearOfManufacture;
        this.numberPlate = numberPlate;
        this.nameOfManufacture = nameOfManufacture;
        this.owner = owner;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNameOfManufacture() {
        return nameOfManufacture;
    }

    public void setNameOfManufacture(String nameOfManufacture) {
        this.nameOfManufacture = nameOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return yearOfManufacture + COMMA +
                numberPlate + COMMA +
                nameOfManufacture + COMMA +
                owner
                ;
    }
}

