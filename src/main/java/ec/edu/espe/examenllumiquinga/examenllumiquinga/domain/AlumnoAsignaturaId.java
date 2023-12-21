package ec.edu.espe.examenllumiquinga.examenllumiquinga.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class AlumnoAsignaturaId  implements Serializable {
     @Column(name = "COD_ALUMNO")
    private Integer codAlumno;

    @Column(name = "COD_ASIGNATURA")
    private String codAsignatura;

    public AlumnoAsignaturaId(Integer codAlumno, String codAsignatura) {
        this.codAlumno = codAlumno;
        this.codAsignatura = codAsignatura;
    }


}
