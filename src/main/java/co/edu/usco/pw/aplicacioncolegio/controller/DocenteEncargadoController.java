package co.edu.usco.pw.aplicacioncolegio.controller;

import co.edu.usco.pw.aplicacioncolegio.entity.DocenteEncargadoEntity;
import co.edu.usco.pw.aplicacioncolegio.repository.DocenteEncargadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteEncargadoController {
    @Autowired
    private DocenteEncargadoRepository docenteEncargadoRepository;

    @GetMapping
    public List<DocenteEncargadoEntity> ObtenerDocentesEncargados() {
        return docenteEncargadoRepository.findAll();
    }
}

