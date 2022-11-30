package ru.test.statisticsservice.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class PostDTO {
    private Long id;
    @JsonAlias("content")
    private String someShitNameInDto;
}
