package co.edu.usco.pw.aplicacioncolegio.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "docentes")
public class DocenteEncargadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docente_encargado_id")
    private Long id;

    @Column(unique = true)
    private String docente;

    @OneToMany(mappedBy = "docente")
    private Set<EventEntity> docentes;

}
