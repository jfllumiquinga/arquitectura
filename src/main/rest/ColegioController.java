package ec.edu.espe.examenllumiquinga.examenllumiquinga.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.service.ColegioService;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;

@RestController
@RequestMapping("/colegios")
public class ColegioController {
private final ColegioService colegioService;

    @Autowired
    public ColegioController(ColegioService colegioService) {
        this.colegioService = colegioService;
    }

    @PostMapping("/crear")
    public Colegio crearColegio(@RequestBody Colegio nuevoColegio) {
        return colegioService.crearColegio(nuevoColegio);
    }
}
