package modelos;

public class TipoExposicion {
    private String descripcion;
    private String nombre;
    private Boolean tieneGuia;
    private Boolean esPermanente;

    public TipoExposicion(String descripcion, String nombre , Boolean esPermanente) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.esPermanente = esPermanente;

    }


    public Boolean getEsPermanente() {
        return esPermanente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoExposicion{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
