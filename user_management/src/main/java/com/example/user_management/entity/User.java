package com.example.user_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column @Getter @Setter
    String username;

    @Column @Getter @Setter
    String firstname;

    @Column @Getter @Setter
    String lastname;

    @Column @Getter @Setter
    String password;

    @Column @Getter @Setter
    String phone;
}
