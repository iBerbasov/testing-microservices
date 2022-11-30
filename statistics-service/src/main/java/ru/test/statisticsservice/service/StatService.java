package ru.test.statisticsservice.service;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.test.statisticsservice.dao.Statistic;
import ru.test.statisticsservice.dto.UserDTO;
import ru.test.statisticsservice.repo.StatRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class StatService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    StatRepository repository;
    @Autowired
    EurekaClient eurekaClient;

//    private final String usersServiceURL = "http://users-service/users";

    public Statistic countStats() {
        String usersServiceURL = eurekaClient.getNextServerFromEureka("users-service",false).getHomePageUrl() + "/users";
        List<UserDTO> users = Arrays.stream(restTemplate.getForEntity(usersServiceURL, UserDTO[].class).getBody()).toList();
        Statistic stat = Statistic.builder()
                .usersCount(users.size())
                .postsCount(users.stream()
                        .map(user -> user.getPosts().size())
                        .reduce(0, Integer::sum))
                .build();
        return repository.save(stat);
    }
}
