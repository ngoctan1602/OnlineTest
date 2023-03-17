package com.iotstar.onlinetest.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "answers")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @Column(nullable = false)
    private boolean correct;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;
}