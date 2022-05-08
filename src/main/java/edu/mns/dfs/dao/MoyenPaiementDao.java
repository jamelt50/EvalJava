package edu.mns.dfs.dao;

import edu.mns.dfs.model.MoyenPaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoyenPaiementDao extends JpaRepository<MoyenPaiement,Integer> {
}
