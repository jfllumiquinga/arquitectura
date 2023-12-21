package ec.edu.espe.examenllumiquinga.examenllumiquinga.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;

@Repository
public interface ColegioRepository extends CrudRepository<Colegio, Integer> {
    List<Colegio> findByNombreContainingIgnoreCase(String nombre);
}