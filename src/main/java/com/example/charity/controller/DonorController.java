package com.example.charity.controller;

import com.example.charity.entity.Donor;
import com.example.charity.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping("/addDonorDetails")
    public boolean addDonorDetails(@RequestBody Donor donor) {
        return donorService.addDonorDetails(donor);
    }

    @GetMapping("/getDonors")
    public List<Donor> getDonors() {
        return donorService.getDonors();
    }

}
