package com.gaavr.myquiz.entity;

import javax.persistence.*;

@Entity
@Table(name = "desk")
public class DeskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String login;
    private String password;
}
