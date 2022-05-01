package com.example.videogamesrealtionaldatabase.controller;

import com.example.videogamesrealtionaldatabase.entity.Company;
import com.example.videogamesrealtionaldatabase.entity.Game;
import com.example.videogamesrealtionaldatabase.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private CompanyService service;

    @GetMapping("get/companies")
    public List<Company> getAllCompanies(){
        return service.showAllCompanies();
    }

    @PostMapping("create/company")
    public Company createCompany(@RequestBody Company company){
        return service.createCompany(company);
    }

    @PostMapping("create/game")
    public Company createGame(@RequestBody Game game){
        return service.createGame(game);
    }

    @DeleteMapping("delete/company")
    public void deleteCompany(@RequestBody Company company){
        service.deleteCompany(company);
    }

    @DeleteMapping("delete/game")
    public void deleteGame(@RequestBody Game game){
        service.deleteGame(game);
    }
}
