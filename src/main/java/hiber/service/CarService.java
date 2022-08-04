package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    void deleteCar(long id);
//    List<Car> getAllCars();
}
