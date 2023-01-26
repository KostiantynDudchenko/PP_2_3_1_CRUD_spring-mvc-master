package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getCars(int count) {
        String hql = "FROM Car";
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setFirstResult(0);
        query.setMaxResults(count);
        return query.getResultList();
    }
}
