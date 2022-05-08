package edu.mns.dfs.dao;

import edu.mns.dfs.model.Caracteristique;
import edu.mns.dfs.model.CleProprieteArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristiqueDao extends JpaRepository<Caracteristique, CleProprieteArticle> {
}
