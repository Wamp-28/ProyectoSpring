package com.example.ProyectoUniversidad.Service;


import com.example.ProyectoUniversidad.Model.Profesor;
import com.example.ProyectoUniversidad.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    public ProfesorRepository profesorRepository;


    public Profesor guardar(Profesor profesor){
        return profesorRepository.save(profesor);
    }

    public List<Profesor> listar(){
        return profesorRepository.findAll();
    }

    public void eliminar(long id){
        profesorRepository.deleteById(id);
    }







}
