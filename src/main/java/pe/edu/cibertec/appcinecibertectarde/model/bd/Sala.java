package pe.edu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idsala;
    @Column(name = "descsala")
    private  String descsala;
    @Column(name = "asientos")
    private Integer asientos;
    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;
}
