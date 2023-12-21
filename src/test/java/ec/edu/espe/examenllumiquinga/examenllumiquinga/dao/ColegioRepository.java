package ec.edu.espe.examenllumiquinga.examenllumiquinga.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;


public interface ColegioRepository extends CrudRepository<Colegio, Integer> {
    List<Colegio> findByNombreContainingIgnoreCase(String nombre);
}