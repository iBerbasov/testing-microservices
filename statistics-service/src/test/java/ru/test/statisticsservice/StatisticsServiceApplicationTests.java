package ru.test.statisticsservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import ru.test.statisticsservice.dto.UserDTO;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class StatisticsServiceApplicationTests {
	private final String usersServiceURL = "http://localhost:8080/users/";

	@Test
	void contextLoads() {
	}
	@Test
	void test() {
		RestTemplate restTemplate = new RestTemplate();
		List<UserDTO> user = Arrays.stream(restTemplate.getForEntity(usersServiceURL, UserDTO[].class).getBody()).toList();
		System.out.println(user);
	}

}
