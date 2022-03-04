package ru.soviet.spring.dao;

import org.hibernate.HibernateException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.soviet.spring.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Query(nativeQuery = true)
    public List<User> index() {
        List<User> list = new ArrayList<User>();
        try {
            list = entityManager
                    .createQuery("FROM User", User.class)
                    .getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }

    @Override
    public User show(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User updateUser) {
        entityManager.merge(updateUser);
    }

    @Override
    public void delete(long id) {
        User userDelete = entityManager.find(User.class, id);
        entityManager.remove(userDelete);
    }
}
