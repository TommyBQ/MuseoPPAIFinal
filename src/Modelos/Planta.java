package Modelos;

public class Planta{
    int numero;
    private Sala[] salas;
    private Archivo[] archivo;
    private int cantidadDeVisitantes;

    public Planta() {
    }

    public Planta(int numero, Sala[] salas, Archivo[] archivo, int cantidadDeVisitantes) {
        this.numero = numero;
        this.salas = salas;
        this.archivo = archivo;
        this.cantidadDeVisitantes = cantidadDeVisitantes;
    }

    public Planta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Planta{" +
                "numero=" + numero +
                '}';
    }

    public void imprimirCantVisitantes(int cantidadDeVisitantes){
        this.cantidadDeVisitantes=cantidadDeVisitantes;

        for(Sala a:salas){
            a.imprimirCantVisitantes(this.cantidadDeVisitantes);
        }
    }
}