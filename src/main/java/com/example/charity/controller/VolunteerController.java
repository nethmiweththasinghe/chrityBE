package com.example.charity.controller;

import com.example.charity.entity.Volunteer;
import com.example.charity.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    @PostMapping("/addVolunteerDetails")
    public String addVolunteerDetails(@RequestBody Volunteer volunteer) {
        return volunteerService.addVolunteerDetails(volunteer);
    }

    @GetMapping("/getVolunteers")
    public List<Volunteer> getVolunteers() {
        return volunteerService.getVolunteers();
    }

    @GetMapping("/getVolunteersByProjectId/{project}")
    public List<Volunteer> getVolunteersByProjectId(@PathVariable String project) {
        return volunteerService.getVolunteersByProjectId(project);
    }

}
