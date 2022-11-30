package ru.test.usersservice.dao;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserDAO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "userDAO", cascade = CascadeType.ALL)
    private List<Post> posts;

}
