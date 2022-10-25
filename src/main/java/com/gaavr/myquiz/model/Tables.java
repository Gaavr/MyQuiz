package com.gaavr.myquiz.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tables")
@Getter
@Setter
public class Tables {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "table_number")
    private Integer tableNumber;
}
