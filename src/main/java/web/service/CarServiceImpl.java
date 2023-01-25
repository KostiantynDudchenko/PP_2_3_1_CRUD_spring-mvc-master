package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Honda", "Sedan", 2005));

        cars.add(new Car("Nissan", "HatchBack", 2006));

        cars.add(new Car("Hyundai", "Minivan", 2007));

        cars.add(new Car("Mitsubishi", "Sports car", 2008));

        cars.add(new Car("Toyota", "Hatch—back", 2009));
    }


    @Override
    public List<Car> getCars(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
