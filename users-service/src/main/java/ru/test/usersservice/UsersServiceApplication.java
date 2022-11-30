package ru.test.usersservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import ru.test.usersservice.dao.Post;
import ru.test.usersservice.dao.UserDAO;
import ru.test.usersservice.repo.UserRepository;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class UsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(UserRepository repo) {
		return args -> {
			Post post1 = new Post();
			post1.setContent("Post1 test cont");
			Post post2 = new Post();
			post1.setContent("Post1 test cont");
			UserDAO user = new UserDAO();
			user.setName("Igor");
			post2.setUserDAO(user);
			post1.setUserDAO(user);
			user.setPosts(Arrays.asList(post1,post2));
			System.out.println(user);
			repo.save(user);
		};
	}
}
