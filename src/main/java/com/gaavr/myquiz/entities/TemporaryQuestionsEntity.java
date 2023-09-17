package com.gaavr.myquiz.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "temporary_questions")
public class TemporaryQuestionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @Column(name = "answer_id")
    private Long answerId;

    private String answer;
}
