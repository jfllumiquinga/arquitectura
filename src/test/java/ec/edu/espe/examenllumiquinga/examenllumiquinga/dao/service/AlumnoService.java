package ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.AlumnoRepository;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.ColegioRepository;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Alumno;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;

public class AlumnoService {
 private final AlumnoRepository alumnoRepository;
    private final ColegioRepository colegioRepository;

    @Autowired
    public AlumnoService(AlumnoRepository alumnoRepository, ColegioRepository colegioRepository) {
        this.alumnoRepository = alumnoRepository;
        this.colegioRepository = colegioRepository;
    }

    public Alumno crearAlumno(Alumno nuevoAlumno) {
        
        Optional<Colegio> colegioExistente = colegioRepository.findById(nuevoAlumno.getColegio().getCodColegio());
        if (colegioExistente.isEmpty()) {
            throw new CreacionExeption("El colegio no existe. No se puede crear el alumno.");
        }

   
        if (nuevoAlumno.getFechaNacimiento() == null || nuevoAlumno.getFechaNacimiento().after(new Date())) {
            throw new CreacionExeption("La fecha de nacimiento no es válida. No se puede crear el alumno.");
        }


        try {
            return alumnoRepository.save(nuevoAlumno);
        } catch (Exception e) {
            throw new RuntimeException("Error durante la creación del alumno.", e);
        }
    }

   

}
