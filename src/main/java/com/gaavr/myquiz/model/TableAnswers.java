package com.gaavr.myquiz.model;

import javax.persistence.*;

@Entity
@Table(name = "tables_answers")
public class TableAnswers {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean isUserAnswerCorrect() {
        return isUserAnswerCorrect;
    }

    public void setUserAnswerCorrect(boolean userAnswerCorrect) {
        isUserAnswerCorrect = userAnswerCorrect;
    }
}
