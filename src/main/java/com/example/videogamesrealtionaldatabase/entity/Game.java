package com.example.videogamesrealtionaldatabase.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Game")
@Table(name = "game")
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String gameName;
    private String genre;
    private Long estimatedHours;
    private Long fkCompanyId;
}
