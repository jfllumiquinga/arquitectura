package ec.edu.espe.examenllumiquinga.examenllumiquinga.domain;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "COLEGIO")
public class Colegio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_COLEGIO")
    private Integer codColegio;

    @Column(name = "NOMBRE")
    private String nombre;

    @OneToMany(mappedBy = "colegio")
    private List<Alumno> alumnos;


    
    public Colegio(Integer codColegio) {
        this.codColegio = codColegio;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codColegio == null) ? 0 : codColegio.hashCode());
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
        Colegio other = (Colegio) obj;
        if (codColegio == null) {
            if (other.codColegio != null)
                return false;
        } else if (!codColegio.equals(other.codColegio))
            return false;
        return true;
    }



    public Integer getCodColegio() {
        return codColegio;
    }

    public void setCodColegio(Integer codColegio) {
        this.codColegio = codColegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }



    @Override
    public String toString() {
        return "Colegio [codColegio=" + codColegio + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
    }



    public Integer getId() {
        return null;
    }

    
}
