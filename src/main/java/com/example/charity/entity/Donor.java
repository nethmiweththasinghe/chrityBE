package com.example.charity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="Donor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor {

    @Id private String id;
    private String userId;
    private String project;
    private double amount;
    private Date createdDate;
}
