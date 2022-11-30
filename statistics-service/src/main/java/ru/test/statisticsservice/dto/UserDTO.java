package ru.test.statisticsservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private List<PostDTO> posts;
}
