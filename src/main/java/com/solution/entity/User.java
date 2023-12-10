package com.solution.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

}
