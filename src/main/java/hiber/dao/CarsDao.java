package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarsDao {
    void addCar(Car car);
    void deleteCar(long id);
//    List<Car> getAllCars();
}
