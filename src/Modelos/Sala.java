package modelos;

import VistasFX.InterfazPantallaSala;

import java.util.Arrays;

public class Sala {
    private String nombre;
    private float superficie;
    private Pared[] pareds;
    private int cantidadDeVisitantes;

    public Sala() {
    }



    public Sala(String nombre, float superficie, Pared[] pareds, int cantidadDeVisitantes) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.pareds = pareds;
        this.cantidadDeVisitantes = cantidadDeVisitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public Pared[] getPareds() {
        return pareds;
    }

    public void setPareds(Pared[] pareds) {
        this.pareds = pareds;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nombre='" + nombre + '\'' +
                ", superficie=" + superficie +
                ", pareds=" + Arrays.toString(pareds) +
                '}';
    }
    public void imprimirCantVisitantes(int cantidadDeVisitantes){
        this.cantidadDeVisitantes=cantidadDeVisitantes;

        InterfazPantallaSala.getInstance().imprimirCantVisitantes(this.cantidadDeVisitantes);

    }
}
