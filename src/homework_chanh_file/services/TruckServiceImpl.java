package homework_chanh_file.services;

import homework_chanh_file.models.Truck;
import homework_chanh_file.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TruckServiceImpl implements IService{
    private List<Truck> truckList = new ArrayList<>();

    public List<Truck> getTruckList() {
        return truckList;
    }

    public void setTruckList(List<Truck> truckList) {
        this.truckList = truckList;
    }

    @Override
    public void create(Vehicle vehicle) {
        truckList.add((Truck) vehicle);
    }

    @Override
    public void read() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void delete(Vehicle vehicle) {
        truckList.remove(vehicle);
    }
}
