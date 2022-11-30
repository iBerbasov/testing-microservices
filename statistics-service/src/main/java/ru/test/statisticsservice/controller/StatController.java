package ru.test.statisticsservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.statisticsservice.dao.Statistic;
import ru.test.statisticsservice.service.StatService;

@RestController
@RequestMapping("/stat")
public class StatController {
    @Autowired
    StatService service;

    @GetMapping
    public ResponseEntity<Statistic> getStatistic() {
        return ResponseEntity.ok(service.countStats());
    }
}
