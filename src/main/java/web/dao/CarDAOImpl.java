package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Honda", "Sedan", 1999));
        carList.add(new Car("Mazda", "HatchBack", 2001));
        carList.add(new Car("Volvo", "Universal", 2003));
        carList.add(new Car("Hyundai", "Minivan", 2020));
        carList.add(new Car("BMW", "SportCar", 2004));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > carList.size()) {
            count = carList.size();
        }
        if (count < 0) {
            count = 0;  // Exclude IndexOutOfBoundsException
        }
        return carList.subList(0, count);
    }
}
