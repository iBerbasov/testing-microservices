package ru.test.statisticsservice.dao;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistic {
    @Id
    @GeneratedValue
    private UUID id;
    private Date createdAt;
    private int usersCount;
    private int postsCount;

    @PrePersist
    private void timeStamp() {
        this.createdAt = new Date();
    }
}
