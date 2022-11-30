package ru.test.usersservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.usersservice.dao.UserDAO;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
    UserDAO findByName(String igor);
}
