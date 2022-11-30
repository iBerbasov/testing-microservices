package ru.test.statisticsservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.statisticsservice.dao.Statistic;

import java.util.UUID;

@Repository
public interface StatRepository extends JpaRepository<Statistic, UUID> {

}
