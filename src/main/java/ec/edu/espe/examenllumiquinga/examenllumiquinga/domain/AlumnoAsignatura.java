package ec.edu.espe.examenllumiquinga.examenllumiquinga.domain;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class AlumnoAsignatura {
    private AlumnoAsignaturaId id;

    @ManyToOne
    @MapsId("codAlumno")
    @JoinColumn(name = "COD_ALUMNO")
    private Alumno alumno;

    @ManyToOne
    @MapsId("codAsignatura")
    @JoinColumn(name = "COD_ASIGNATURA")
    private Asignatura asignatura;

    @Column(name = "CALIFICACION1")
    private Double calificacion1;

    @Column(name = "CALIFICACION2")
    private Double calificacion2;

    @Column(name = "CALIFICACION3")
    private Double calificacion3;

    @Column(name = "PROMEDIO")
    private Double promedio;

    @Column(name = "ESTADO")
    private String estado;

    

    public AlumnoAsignatura(AlumnoAsignaturaId id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AlumnoAsignatura other = (AlumnoAsignatura) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AlumnoAsignatura [id=" + id + ", alumno=" + alumno + ", asignatura=" + asignatura + ", calificacion1="
                + calificacion1 + ", calificacion2=" + calificacion2 + ", calificacion3=" + calificacion3
                + ", promedio=" + promedio + ", estado=" + estado + "]";
    }

    
}
