package homework_chanh_file.services;

import homework_chanh_file.models.MotorBike;
import homework_chanh_file.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MotorBikeServiceImpl implements IService {
    private List<MotorBike> motorBikeList = new ArrayList<>();

    public List<MotorBike> getMotorBikeList() {
        return motorBikeList;
    }

    public void setMotorBikeList(List<MotorBike> motorBikeList) {
        this.motorBikeList = motorBikeList;
    }

    @Override
    public void create(Vehicle vehicle) {
        motorBikeList.add((MotorBike) vehicle);
    }

    @Override
    public void read() {
        for (MotorBike motorBike : motorBikeList) {
            System.out.println(motorBike);
        }
    }

    @Override
    public void delete(Vehicle vehicle) {
        motorBikeList.remove(vehicle);
    }
}
