package com.example.ProyectoUniversidad.Repository;


import com.example.ProyectoUniversidad.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
