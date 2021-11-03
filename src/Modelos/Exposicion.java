package modelos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Exposicion {
    private LocalDate fechaFin;
    private LocalDate FinReplanificada;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioReplanificada;
    private LocalDate horaApertura;
    private LocalDate horaCierra;
    private String nombre;
    private TipoExposicion tipoExposicion;
    private DetalleExposicion[] detalleExposicions;
    private PublicoDestino[] publicoDestinos;
    private Empleado[] empleados;
    private boolean esVigente=false;

    private float tiempoExplicacionExtendida;
    private float tiempoExplicacionResumida;

    public Exposicion() {
    }

    public Exposicion(LocalDate fechaFin, LocalDate finReplanificada, LocalDate fechaInicio, LocalDate fechaInicioReplanificada, LocalDate horaApertura, LocalDate horaCierra, String nombre, TipoExposicion tipoExposicion, DetalleExposicion[] detalleExposicions, PublicoDestino[] publicoDestinos, Empleado[] empleados) {
        this.fechaFin = fechaFin;
        FinReplanificada = finReplanificada;
        this.fechaInicio = fechaInicio;
        this.fechaInicioReplanificada = fechaInicioReplanificada;
        this.horaApertura = horaApertura;
        this.horaCierra = horaCierra;
        this.nombre = nombre;
        this.tipoExposicion = tipoExposicion;
        this.detalleExposicions = detalleExposicions;
        this.publicoDestinos = publicoDestinos;
        this.empleados = empleados;
        this.tiempoExplicacionExtendida = 0;
        this.tiempoExplicacionResumida = 0;
    }

    public Exposicion(LocalDate fechaFin, LocalDate finReplanificada, LocalDate fechaInicio, LocalDate fechaInicioReplanificada, LocalDate horaApertura, LocalDate horaCierra, String nombre, TipoExposicion tipoExposicion, DetalleExposicion[] detalleExposicions, PublicoDestino[] publicoDestinos, Empleado[] empleados , float tiempoExplicacionExtendida , float tiempoExplicacionResumida) {
        this.fechaFin = fechaFin;
        FinReplanificada = finReplanificada;
        this.fechaInicio = fechaInicio;
        this.fechaInicioReplanificada = fechaInicioReplanificada;
        this.horaApertura = horaApertura;
        this.horaCierra = horaCierra;
        this.nombre = nombre;
        this.tipoExposicion = tipoExposicion;
        this.detalleExposicions = detalleExposicions;
        this.publicoDestinos = publicoDestinos;
        this.empleados = empleados;
        this.tiempoExplicacionExtendida = tiempoExplicacionExtendida;
        this.tiempoExplicacionResumida = tiempoExplicacionResumida;
    }

    public void setTiempoExplicacionExtendida( float time ){
        this.tiempoExplicacionExtendida = time ;
        return;
    }
    public void setTiempoExplicacionResumida( float time ){
        this.tiempoExplicacionResumida= time ;
        return;
    }

    public float getTiempoExplicacionExtendida(){
        return this.tiempoExplicacionExtendida;
    }

    public float getTiempoExplicacionResumida(){
        return this.tiempoExplicacionResumida;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFinReplanificada() {
        return FinReplanificada;
    }

    public void setFinReplanificada(LocalDate finReplanificada) {
        FinReplanificada = finReplanificada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicioReplanificada() {
        return fechaInicioReplanificada;
    }

    public void setFechaInicioReplanificada(LocalDate fechaInicioReplanificada) {
        this.fechaInicioReplanificada = fechaInicioReplanificada;
    }

    public LocalDate getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalDate horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalDate getHoraCierra() {
        return horaCierra;
    }

    public void setHoraCierra(LocalDate horaCierra) {
        this.horaCierra = horaCierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoExposicion getTipoExposicion() {
        return tipoExposicion;
    }

    public void setTipoExposicion(TipoExposicion tipoExposicion) {
        this.tipoExposicion = tipoExposicion;
    }

    public DetalleExposicion[] getDetalleExposicions() {
        return this.detalleExposicions;
    }

    public void setDetalleExposicions(DetalleExposicion[] detalleExposicions) {
        this.detalleExposicions = detalleExposicions;
    }

    public PublicoDestino[] getPublicoDestinos() {
        return publicoDestinos;
    }

    public void setPublicoDestinos(PublicoDestino[] publicoDestinos) {
        this.publicoDestinos = publicoDestinos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Exposicion{" +
                "fechaFin=" + fechaFin +
                ", FinReplanificada=" + FinReplanificada +
                ", fechaInicio=" + fechaInicio +
                ", fechaInicioReplanificada=" + fechaInicioReplanificada +
                ", horaApertura=" + horaApertura +
                ", horaCierra=" + horaCierra +
                ", nombre='" + nombre + '\'' +
                ", tipoExposicion=" + tipoExposicion +
                ", detalleExposicions=" + Arrays.toString(detalleExposicions) +
                ", publicoDestinos=" + Arrays.toString(publicoDestinos) +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    public Boolean esVigente(){
        LocalDate hoy = LocalDate.now();

        if((hoy.isBefore(this.fechaFin)||hoy.equals(this.fechaFin)) && (hoy.isAfter(this.fechaInicio)||hoy.equals(this.fechaInicio))){
            this.esVigente=true;
        }else {
            this.esVigente=false;
        }
     return this.esVigente;
    }

    public float getDuracion(){
        float duracion=0;
        for(DetalleExposicion e:this.detalleExposicions) {
            duracion = duracion + e.sumarDuracionResumida();
        }
        return duracion;
    }
}
