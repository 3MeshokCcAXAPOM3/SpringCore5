package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Autowired
   private CarService carService;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }
   @Override
   @Transactional
   public void addCarToUser(long userId, Car car){
      User user = userDao.findUserId(userId);
         car.setUser(user);
         user.setCar(car);
         carService.addCar(car);

   }
   @Override
   @Transactional(readOnly = true)
   public User findUserByCar (String model, int series){
      return userDao.findUserByCar(model, series);
   }


   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

}
