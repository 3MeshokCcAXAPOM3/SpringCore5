package hiber.service;

import hiber.dao.CarsDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarsDao carsDao;

    @Transactional
    @Override
    public void addCar(Car car) {carsDao.addCar(car);}


    @Transactional
    @Override
    public void deleteCar(long id) {carsDao.deleteCar(id);

    }

//    @Override
//    public List<Car> getAllCars() {return carsDao.getAllCars();
//
//    }
}
