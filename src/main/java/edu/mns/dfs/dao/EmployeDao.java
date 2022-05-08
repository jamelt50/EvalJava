package edu.mns.dfs.dao;

import edu.mns.dfs.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository<Employe,Integer> {

    int countByAdministrateur(boolean b);
    boolean existsByLogin(String login);
}
