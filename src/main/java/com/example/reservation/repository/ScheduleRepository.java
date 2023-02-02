package com.example.reservation.repository;

import com.example.reservation.entity.Room;
import com.example.reservation.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    public List<Schedule> findAllByRsvRm(Room room);

}

