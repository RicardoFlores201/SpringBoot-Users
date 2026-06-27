package com.testing.learning.users.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "last_connection")
    private String last_connection;

    @Column(name = "country")
    private String country;

    @Column(name = "website")
    private String website;

    @Column(name = "username")
    private String username;

    @Column(name = "followers")
    private String followers;

    @Column(name = "following")
    private String following;
}
