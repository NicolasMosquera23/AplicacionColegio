package co.edu.usco.pw.aplicacioncolegio.controller;

import co.edu.usco.pw.aplicacioncolegio.entity.DocenteEncargadoEntity;
import co.edu.usco.pw.aplicacioncolegio.entity.EventEntity;
import co.edu.usco.pw.aplicacioncolegio.repository.DocenteEncargadoRepository;
import co.edu.usco.pw.aplicacioncolegio.service.EventServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("events")
public class EventController {
    private final EventServiceImp eventServiceImp;
    private final DocenteEncargadoRepository docenteEncargadoRepository;

    @GetMapping
    public String events(Model model) {
        model.addAttribute("events", eventServiceImp.getAll());
        return "events";
    }

    @GetMapping("create")
    public String createForm(Model model) {
        model.addAttribute("event", new EventEntity());
        model.addAttribute("docentes", docenteEncargadoRepository.findAll());
        return "create_event";
    }

    @PostMapping("create")
    public String save(@ModelAttribute EventEntity event, @RequestParam Long docenteId) {
        DocenteEncargadoEntity docente = docenteEncargadoRepository.findById(docenteId) .orElseThrow(() -> new IllegalArgumentException("Invalid car Id:" + docenteId));
        event.setDocente(docente);
        eventServiceImp.create(event);
        return "redirect:/events";
    }

    @GetMapping("edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        EventEntity event = eventServiceImp.getById(id);
        model.addAttribute("event", event);
        return "edit_event";
    }

    @PostMapping("edit/{id}")
    public String update(@PathVariable Long id, @ModelAttribute EventEntity event) {
        eventServiceImp.update(id, event);
        return "redirect:/events";
    }

    @PostMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        eventServiceImp.delete(id);
        return "redirect:/events";
    }
}
