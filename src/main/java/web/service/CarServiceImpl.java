package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
