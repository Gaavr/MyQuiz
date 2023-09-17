package com.gaavr.myquiz.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "result")
@Getter
@Setter
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "table_id")
    private Long tableId;

    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "table_answer")
    private String tableAnswer;

    @Column(name = "is_correct")
    private Boolean isCorrect;

}
