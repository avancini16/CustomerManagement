package com.example.CustomerManagement.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotEmpty
    private String name;

    @Column(nullable = false)
    @NotEmpty
    private String lastname;

    @Column(nullable = false)
    @NotNull
    private int age;

    @Column(nullable = false)
    @NotEmpty
    @Email
    private String email;

    @Column(nullable = false)
    @NotNull
    private int number;
}
