package VistasFX;

public class InterfazPantallaSala {
    private int cantidadDeVisitantes;
    private static InterfazPantallaSala instance;

    public static InterfazPantallaSala getInstance(){
        if (instance == null) {
            instance = new InterfazPantallaSala();
        }
        return instance;
    }
    public void imprimirCantVisitantes(int cantidadDeVisitantes){
        this.cantidadDeVisitantes=cantidadDeVisitantes;
        System.out.println("Pantalla Sala: La cantidad de visitantes de la sede es:"+this.cantidadDeVisitantes );
    }
}
