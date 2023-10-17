package com.example.charity.service;

import com.example.charity.entity.Donor;
import com.example.charity.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    public boolean addDonorDetails(Donor donor) {
        donor.setId(UUID.randomUUID().toString().split("-")[0]);
        donorRepository.save(donor);
        return true;
    }

    public List<Donor> getDonors() {
        return donorRepository.findAll();
    }
}
