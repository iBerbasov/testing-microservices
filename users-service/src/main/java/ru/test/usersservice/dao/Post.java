package ru.test.usersservice.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private Date createdAt;
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private UserDAO userDAO;

    @PrePersist
    public void prePersist(){
        this.createdAt = new Date();
    }


}