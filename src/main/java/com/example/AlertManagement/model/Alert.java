package com.example.AlertManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "alert")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "scenario_id")
    private Long scenarioId;

    @Column(name = "headlines")
    private String headlines;

    @Column(name = "insert_date")
    private LocalDateTime insertDate;

    @Column(name = "explanation")
    private String explanation;

    @Column(name = "status")
    private String status;

}
