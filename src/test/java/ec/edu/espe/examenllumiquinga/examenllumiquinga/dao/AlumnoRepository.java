package ec.edu.espe.examenllumiquinga.examenllumiquinga.dao;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Alumno;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

    
    Optional<Alumno> findByCedulaAndColegio(Integer cedula, Colegio colegio);

  
    List<Alumno> findByFechaNacimientoBefore(java.sql.Date fechaActual);

}