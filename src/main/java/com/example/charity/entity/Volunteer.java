package com.example.charity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Volunteer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Volunteer {

    @Id private String id;
    private String userId;
    private String project;
    private String description;
    private String other;

}
