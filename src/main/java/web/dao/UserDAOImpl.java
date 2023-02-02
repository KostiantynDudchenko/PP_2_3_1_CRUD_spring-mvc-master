package web.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsers() {
        return entityManager.createQuery("select e from User e").getResultList();
    }

    @Override
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        User userToBeUpdate = show(id);
        userToBeUpdate.setName(user.getName());
        userToBeUpdate.setSurname(user.getSurname());
        userToBeUpdate.setAge(user.getAge());
        entityManager.merge(userToBeUpdate);
    }

    @Override
    @Transactional
    public void delete(int id) {
        entityManager.remove(entityManager.contains(show(id)) ? show(id) : entityManager.merge(show(id)));
    }
}
