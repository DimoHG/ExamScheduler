package com.spring.boot.scheduler.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ExamHall {
    @Id
    @GeneratedValue
    private Long id;

    private int capacity;

    private String hallName;

    public ExamHall(Long id, int capacity, String hallName) {
        this.id = id;
        this.capacity = capacity;
        this.hallName = hallName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @Override
    public String toString() {
        return "ExamHall{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", hallName='" + hallName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamHall examHall = (ExamHall) o;
        return capacity == examHall.capacity &&
                Objects.equals(id, examHall.id) &&
                Objects.equals(hallName, examHall.hallName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, capacity, hallName);
    }
}
