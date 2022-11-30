package ru.test.usersservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.usersservice.dao.UserDAO;
import ru.test.usersservice.repo.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MainController {

    @Autowired
    UserRepository repository;

    @GetMapping
    public ResponseEntity<List<UserDAO>> getAllUsersWithPosts() {
        List<UserDAO> users = repository.findAll();
        users.forEach(System.out::println);
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping("/1")
    public ResponseEntity<UserDAO> getAllUsersWithPosts2222() {
        List<UserDAO> users = repository.findAll();
        users.forEach(System.out::println);
        return ResponseEntity.ok(repository.findByName("Igor"));
    }

}
