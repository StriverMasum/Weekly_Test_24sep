package com.geekster.Weekly.Test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

    //member variable
    @Id
    private Long id;

    private String title;

    private String description;

    private String location;
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    @Email(message = "Invalid email format")
    private String companyEmail;

    private String companyName;

    private String employerName;

    @Enumerated(EnumType.STRING)
    private Type JobType;

    private LocalDate appliedDate;
}
