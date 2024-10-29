package co.edu.usco.pw.aplicacioncolegio.repository;

import co.edu.usco.pw.aplicacioncolegio.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<EventEntity, Long> {}
