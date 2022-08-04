package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarsDaoImp implements CarsDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCar(Car car) {sessionFactory.getCurrentSession().save(car);

    }

    @Override
    public void deleteCar(long id) {sessionFactory.getCurrentSession().delete(this);

    }

//    @Override
//    public List<Car> getAllCars()
//    {TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Car");
//        return query.getResultList();
//    }
}
