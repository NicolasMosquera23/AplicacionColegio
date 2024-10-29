package co.edu.usco.pw.aplicacioncolegio.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "events")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(unique = true)
    private String NombreAsignatura;

    private String Descripcion;

    private Number Salon;

    private LocalTime Horario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docente_encargado_id", nullable = false)  // Columna de clave externa en Vehiculo
    private DocenteEncargadoEntity docente;

}
