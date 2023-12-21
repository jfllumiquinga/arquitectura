package ec.edu.espe.examenllumiquinga.examenllumiquinga.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.service.AlumnoService;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.service.ColegioService;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Alumno;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;

@RestController
@RequestMapping("/Alumno")
public class AlumnoController {
private final AlumnoService alumnoService;

    @Autowired
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping("/crear")
    public Alumno crearAlumno(@RequestBody Alumno nuevoAlumno) {
        return alumnoService.crearAlumno(nuevoAlumno);
    }
}
