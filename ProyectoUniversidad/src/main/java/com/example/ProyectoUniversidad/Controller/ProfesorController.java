package com.example.ProyectoUniversidad.Controller;

import com.example.ProyectoUniversidad.Model.Profesor;
import com.example.ProyectoUniversidad.Service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorController {

    @Autowired
    public ProfesorService profesorService;


    @GetMapping("/listar")
    public List<Profesor> listar() {
        return profesorService.listar();

    }

    @PostMapping("/guardar")
    public Profesor guardar(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable  long id){
        profesorService.eliminar(id);

    }

}
