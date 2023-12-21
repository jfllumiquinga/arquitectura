package ec.edu.espe.examenllumiquinga.examenllumiquinga.domain;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Asignatura {

    @Id
    @Column(name = "COD_ASIGNATURA")
    private String codAsignatura;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "CREDITOS")
    private Integer creditos;

    @OneToMany(mappedBy = "asignatura")
    private List<AlumnoAsignatura> alumnos;



    
    public Asignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAsignatura == null) ? 0 : codAsignatura.hashCode());
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
        Asignatura other = (Asignatura) obj;
        if (codAsignatura == null) {
            if (other.codAsignatura != null)
                return false;
        } else if (!codAsignatura.equals(other.codAsignatura))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura [codAsignatura=" + codAsignatura + ", nombre=" + nombre + ", creditos=" + creditos
                + ", alumnos=" + alumnos + "]";
    }


    
}
