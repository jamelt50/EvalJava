package edu.mns.dfs.controller;

import com.fasterxml.jackson.annotation.JsonView;

import edu.mns.dfs.dao.EmployeDao;
import edu.mns.dfs.dao.UtilisateurDao;
import edu.mns.dfs.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class UtilisateurController {
private UtilisateurDao utilisateurDao;
private EmployeDao  employeDao;
    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao, EmployeDao employeDao) {
        this.utilisateurDao = utilisateurDao;
        this.employeDao = employeDao;
    }
    @GetMapping("/compte-Utilisateur")
    public int compteUtilisateur(){
        return utilisateurDao.compteUtilisateur();
    }
    @DeleteMapping("/utilisateur/{login}")
    public void supprimeUtilisateur(@PathVariable String login){
        if(!employeDao.existsByLogin(login)){
            utilisateurDao.deleteByLogin(login);
        }
    }
}