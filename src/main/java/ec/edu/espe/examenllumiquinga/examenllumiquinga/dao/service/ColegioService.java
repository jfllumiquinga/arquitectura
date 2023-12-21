package ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.espe.examenllumiquinga.examenllumiquinga.dao.ColegioRepository;
import ec.edu.espe.examenllumiquinga.examenllumiquinga.domain.Colegio;

@Service
@Transactional
public class ColegioService {

    public static final String TIPO_CLIENTE_PERSONA = "NAT";
    private final ColegioRepository colegioRepository;
   
    public  ColegioService(ColegioRepository colegioRepository ) {
        this.colegioRepository = colegioRepository;
      
    }

    @Transactional
    public Colegio crearColegio(Colegio nuevoColegio) {
    
    
     if (nuevoColegio == null || nuevoColegio.getNombre() == null || nuevoColegio.getNombre().isEmpty()) {
        throw new CreacionExeption("El nombre del colegio es obligatorio para la creación.");
    }


    try {
        return colegioRepository.save(nuevoColegio);
    } catch (Exception e) {
        throw new RuntimeException("Error durante la creación del colegio.", e);
    }
    }

    
    public List<Colegio> obtenerColegiosPorNombre(String patronNombre) {
      
        if (patronNombre == null || patronNombre.isEmpty()) {
            throw new CreacionExeption("El patrón de nombre no puede estar vacío.");
        }

        try {
            return colegioRepository.findByNombreContainingIgnoreCase(patronNombre);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lista de colegios por nombre.", e);
        }
    }

}
