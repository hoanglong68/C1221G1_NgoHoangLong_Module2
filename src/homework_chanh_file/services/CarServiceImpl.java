package homework_chanh_file.services;

import homework_chanh_file.models.Car;
import homework_chanh_file.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements IService {
    private List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void create(Vehicle vehicle) {
        carList.add((Car) vehicle);
    }

    @Override
    public void read() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void delete(Vehicle vehicle) {
        carList.remove(vehicle);
    }
}
