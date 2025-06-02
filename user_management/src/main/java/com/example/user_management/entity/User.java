package com.example.user_management.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;

@Entity
@Getter @Setter
@ResponseBody
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Getter @Setter
    @Column
    String username;

    @Getter @Setter
    @Column
    String firstname;

    @Getter @Setter
    @Column
    String lastname;

    @Getter @Setter
    @Column
    String password;

    @Getter @Setter
    @Column
    String phone;

    @Column @CreationTimestamp
    Instant createdAt;

    public User() {}
}
