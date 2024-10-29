package co.edu.usco.pw.aplicacioncolegio.service;

import co.edu.usco.pw.aplicacioncolegio.entity.EventEntity;
import co.edu.usco.pw.aplicacioncolegio.repository.EventRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImp implements EventService<EventEntity, Long> {
    private final EventRepository eventRepository;

    @Override
    public List<EventEntity> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public EventEntity getById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Event not found!"));
    }

    @Override
    public void create(EventEntity eventEntity) {
        eventRepository.save(eventEntity);
    }

    @Override
    public void update(Long id, EventEntity eventEntity) {
        EventEntity eventDB = eventRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Event not found!"));
        eventDB.setNombreAsignatura(eventEntity.getNombreAsignatura());
        eventDB.setDescripcion(eventEntity.getDescripcion());
        eventDB.setSalon(eventEntity.getSalon());
        eventDB.setHorario(eventEntity.getHorario());
        eventRepository.save(eventDB);
    }

    @Override
    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}

