package edu.mns.dfs.model;




import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.CommandeView;
import edu.mns.dfs.view.EmployeView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(EmployeView.class)
    private  Integer id;

    @JsonView({EmployeView.class, CommandeView.class})
    private String login;


    private String password;
@ManyToMany
    private Set<MoyenPaiement> listMoyenPaiement = new HashSet<>();
    @OneToMany(mappedBy = "client")
    private Set<Commande> listeCommande = new HashSet<>();
}