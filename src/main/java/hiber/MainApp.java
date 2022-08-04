package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

//      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));

//      CarService carService = context.getBean(CarService.class);
//      carService.addCar(new Car("Lada",8873332));
//      carService.addCar(new Car("BMW",1377352));
//      carService.addCar(new Car("Honda",4377374));
//      carService.getAllCars().forEach(System.out::println);

//      userService.addCarToUser(13,new Car("Scoda", 33211235));
//      userService.addCarToUser(15,new Car("Volvo", 526131235));



      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }
      System.out.println(userService.findUserByCar("Scoda",33211235));

      System.out.println(userService.findUserByCar("Volvo",526131235));

      context.close();
   }
}
