package ru.test.usersservice.dao;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class UserDAO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "userDAO", cascade = CascadeType.ALL)
//    @Fetch(FetchMode.JOIN)
    private List<Post> posts;

//    public void addNewPost(Post post) {
//        if (this.posts == null) {
//            this.posts = new ArrayList<>();
//        }
//        post.setUserDAO(this);
//        this.posts.add(post);
//    }
}
