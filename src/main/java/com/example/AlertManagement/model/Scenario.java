package com.example.AlertManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "scenario")
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "insert_date")
    private LocalDateTime insertDate;

    @Column(name = "cancel_date")
    private LocalDateTime cancelDate;

    @Column(name = "alert_table")
    private Integer alertTable;

    @Column(name = "definition")
    private String definition;

    @Column(name = "is_active")
    private Boolean isActive;
}
