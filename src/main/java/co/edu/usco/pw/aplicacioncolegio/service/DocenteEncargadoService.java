package co.edu.usco.pw.aplicacioncolegio.service;

import co.edu.usco.pw.aplicacioncolegio.entity.DocenteEncargadoEntity;
import co.edu.usco.pw.aplicacioncolegio.repository.DocenteEncargadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DocenteEncargadoService {

    @Autowired
    private DocenteEncargadoRepository docenteEncargadoRepository;

    public List<DocenteEncargadoEntity> ObtenerDocentesEncargados() {
        return docenteEncargadoRepository.findAll();
    }
}

