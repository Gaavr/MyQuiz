package com.gaavr.myquiz.entity;

import javax.persistence.*;

@Entity
@Table(name = "desk")
public class DeskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
