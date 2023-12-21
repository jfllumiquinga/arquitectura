package ec.edu.espe.examenllumiquinga.examenllumiquinga.domain;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ALUMNO")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ALUMNO")
    private Integer codAlumno;

    @ManyToOne
    @JoinColumn(name = "COD_COLEGIO")
    private Colegio colegio;

    @Column(name = "CEDULA")
    private Integer cedula;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "FECHA_NACIMIENTO")
    private java.sql.Date fechaNacimiento;

    @Column(name = "FECHA_CREACION")
    private java.sql.Timestamp fechaCreacion;

    @OneToMany(mappedBy = "alumno")
    private List<AlumnoAsignatura> asignaturas;


    
    public Alumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
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
        Alumno other = (Alumno) obj;
        if (codAlumno == null) {
            if (other.codAlumno != null)
                return false;
        } else if (!codAlumno.equals(other.codAlumno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Alumno [codAlumno=" + codAlumno + ", colegio=" + colegio + ", cedula=" + cedula + ", nombre=" + nombre
                + ", fechaNacimiento=" + fechaNacimiento + ", fechaCreacion=" + fechaCreacion + ", asignaturas="
                + asignaturas + "]";
    }

   
}
