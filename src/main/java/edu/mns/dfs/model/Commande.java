package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.CommandeView;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date datePaiement;

    @ManyToOne
    @JsonView(CommandeView.class)
    private Utilisateur client;

    @OneToMany(mappedBy = "commande")
    @JsonView(CommandeView.class)
    private Set<LigneCommande> listeLigneCommande = new HashSet<>();

}
