package ec.edu.ups.practica5.myrka_pallo.juan_fernandez.modelo;

import java.util.Objects;

public class Disco {
    private int codigo;
    private String nombre;
    private int anioDeLanzamiento;
    
//contructor
    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }
//set y get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }
// equals codigo
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.anioDeLanzamiento != other.anioDeLanzamiento) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
// to String
    @Override
    public String toString() {
        return "\tDisco: \n\tCodigo: " + codigo + "\n\tNombre: " + nombre + 
                "\n\tAnio de Lanzamiento: " + anioDeLanzamiento + '\n';
    }
    
    
}
