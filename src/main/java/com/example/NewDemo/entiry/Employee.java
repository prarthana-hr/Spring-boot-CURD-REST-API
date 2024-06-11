package com.example.NewDemo.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.NotFound;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //used for OMS mapping
@Table(name = "employees")
public class Employee {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Column(name = "firstname")
    private String firstname;
    @NonNull
    @Column(name = "lastname")
    private String lastname;
    @NonNull
    @Column(name = "email")
    private String email;
    @NonNull
    @Column(name = "mobileno")
    private long mobileno;
}
