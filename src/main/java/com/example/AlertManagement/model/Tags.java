package com.example.AlertManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tags")
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "color")
    private String color;

    @Column(name = "insert_date")
    private LocalDateTime insertDate;

    @Column(name = "cancel_date")
    private LocalDateTime cancelDate;
}
