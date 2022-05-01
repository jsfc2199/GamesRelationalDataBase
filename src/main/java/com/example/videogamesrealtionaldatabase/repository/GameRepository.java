package com.example.videogamesrealtionaldatabase.repository;

import com.example.videogamesrealtionaldatabase.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
