package edu.mns.dfs.controller;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.dao.EmployeDao;
import edu.mns.dfs.model.Employe;
import edu.mns.dfs.view.EmployeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeController {
    private EmployeDao employeDao;
    @Autowired
    public EmployeController(EmployeDao employeDao) {
        this.employeDao = employeDao;
    }
    @GetMapping("/employe/{id}")
    @JsonView(EmployeView.class)
    public Employe employe(@PathVariable Integer id) {
        return employeDao.findById(id).orElse(null);
    }
    @GetMapping("/liste-employe")
    @JsonView(EmployeView.class)
    public List<Employe> listeEmploye() {
        return employeDao.findAll();
    }
    @GetMapping("/compte-administrateur")
    public int compteAdministrateur() {
        return employeDao.countByAdministrateur(true);
    }

}
