package com.example.videogamesrealtionaldatabase.service;

import com.example.videogamesrealtionaldatabase.entity.Company;
import com.example.videogamesrealtionaldatabase.entity.Game;
import com.example.videogamesrealtionaldatabase.repository.CompanyRepository;
import com.example.videogamesrealtionaldatabase.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImplementation implements CompanyService{

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company createGame(Game game) {
        Company company = companyRepository.findById(game.getFkCompanyId()).get();
        company.addGame(game);
        gameRepository.save(game);
        return companyRepository.save(company);
    }

    @Override
    public void deleteGame(Game game) {
        gameRepository.deleteById(game.getId());
    }

    @Override
    public void deleteCompany(Company company) {
        Company companayToDelete = companyRepository.findById(company.getId()).get();
        if(companayToDelete.getGames().size()>=0){
            companayToDelete.getGames().forEach(game -> gameRepository.deleteById(game.getId()));
        }
        companyRepository.deleteById(company.getId());
    }

    @Override
    public List<Company> showAllCompanies() {
        return companyRepository.findAll();
    }

}
