package ru.soviet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.soviet.spring.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}