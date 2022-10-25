package com.gaavr.myquiz.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tables_answers")
@Getter
@Setter
public class TableAnswers {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "table_id")
    private String tableId;

    @Column(name = "question_id")
    private String questionId;

    @Column(name = "answer_id")
    private String answerId;

    @Column(name = "user_anser")
    private String userAnswer;

    @Column(name = "is_user_answer_correct")
    private boolean isUserAnswerCorrect;
}
