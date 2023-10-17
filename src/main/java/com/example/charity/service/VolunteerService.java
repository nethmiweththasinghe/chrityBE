package com.example.charity.service;

import com.example.charity.entity.Volunteer;
import com.example.charity.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    public String addVolunteerDetails(Volunteer volunteer) {
        volunteer.setId(UUID.randomUUID().toString().split("-")[0]);
        volunteerRepository.save(volunteer);
        return "Added Successfully";
    }

    public List<Volunteer> getVolunteers() {
        return volunteerRepository.findAll();
    }

    public List<Volunteer> getVolunteersByProjectId(String project){
        return volunteerRepository.findByproject(project);
    }
}
