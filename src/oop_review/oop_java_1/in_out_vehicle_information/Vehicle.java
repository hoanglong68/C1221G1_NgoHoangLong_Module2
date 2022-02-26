package oop_review.oop_java_1.in_out_vehicle_information;

public class Vehicle {
    private int valueOfVehicle;
    private int capacityOfVehicle;

    public Vehicle() {
    }

    public Vehicle(int valueOfVehicle, int capacityOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
        this.capacityOfVehicle = capacityOfVehicle;
    }

    public int getValueOfVehicle() {
        return valueOfVehicle;
    }

    public void setValueOfVehicle() {
        this.valueOfVehicle = valueOfVehicle;
    }

    public int getCapacityOfVehicle() {
        return capacityOfVehicle;
    }

    public void setCapacityOfVehicle(int capacityOfVehicle) {
        this.capacityOfVehicle = capacityOfVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "valueOfVehicle=" + valueOfVehicle +
                ", capacityOfVehicle=" + capacityOfVehicle +
                '}';
    }

    public double getTaxOfVehicle() {
        if (this.getCapacityOfVehicle() > 200) {
            return getValueOfVehicle() * 0.05;
        } else if (this.getCapacityOfVehicle() > 100) {
            return getValueOfVehicle() * 0.03;
        } else return getValueOfVehicle() * 0.01;
    }
}
