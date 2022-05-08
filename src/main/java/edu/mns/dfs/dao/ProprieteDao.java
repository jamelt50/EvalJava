package edu.mns.dfs.dao;

import edu.mns.dfs.model.Propriete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprieteDao extends JpaRepository<Propriete,Integer> {
}
