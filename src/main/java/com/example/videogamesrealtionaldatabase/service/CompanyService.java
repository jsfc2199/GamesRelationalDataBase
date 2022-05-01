package com.example.videogamesrealtionaldatabase.service;

import com.example.videogamesrealtionaldatabase.entity.Company;
import com.example.videogamesrealtionaldatabase.entity.Game;

import java.util.List;

public interface CompanyService {
    Company createCompany(Company company);
    Company createGame(Game game);
    void deleteGame(Game game);
    void deleteCompany(Company company);

    List<Company> showAllCompanies();
}
