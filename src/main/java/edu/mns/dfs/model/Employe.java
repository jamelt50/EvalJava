package edu.mns.dfs.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.mns.dfs.view.EmployeView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Employe extends Utilisateur {
    @JsonView(EmployeView.class)
    private boolean administrateur;

    @OneToMany(mappedBy = "gestionnaire")
    @JsonView({EmployeView.class})
    private Set<Article> listeArticleAgerer = new HashSet<>();
}
