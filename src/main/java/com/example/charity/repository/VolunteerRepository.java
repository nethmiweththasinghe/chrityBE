package com.example.charity.repository;

import com.example.charity.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, String> {

    @Query(value = "SELECT * FROM Volunteer WHERE project=?1", nativeQuery = true)
    List<Volunteer> findByproject(String project);
}
