package com.example.videogamesrealtionaldatabase.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Company")
@Table(name = "company")
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;

    //list of games 'cause a company can have many games
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Game> games = new ArrayList<>();

    //adding the games to the company
    public Company addGame(Game game){
        this.games.add(game);
        return this;
    }
}
