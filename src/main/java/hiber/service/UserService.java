package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void addCarToUser(long userId, Car car);
    User findUserByCar (String model, int series);
}
