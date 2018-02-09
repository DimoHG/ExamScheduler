package com.spring.boot.scheduler.repository;

import com.spring.boot.scheduler.entities.ExamHall;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamHallRepository extends CrudRepository<ExamHall, Long> {
    List<ExamHall> findByHallName(String hallName);

}
