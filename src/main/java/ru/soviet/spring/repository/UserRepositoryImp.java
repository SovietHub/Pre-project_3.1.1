package ru.soviet.spring.repository;

import org.springframework.stereotype.Component;
import ru.soviet.spring.models.User;

import java.util.Optional;

@Component
public class UserRepositoryImp implements UserRepository {

    //без переопределения методов ниже будет ошибка:

    //Parameter 0 of constructor in ru.soviet.spring.controllers.UsersController
    //required a bean of type 'ru.soviet.spring.repository.UserRepository' that could not be found.
    @Override
    public <S extends User> S save(S s) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> iterable) {

    }

    @Override
    public void deleteAll() {

    }

}