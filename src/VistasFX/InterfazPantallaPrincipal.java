package VistasFX;

public class InterfazPantallaPrincipal {
    private int cantidadDeVisitantes;
    private static InterfazPantallaPrincipal instance;

    public static InterfazPantallaPrincipal getInstance(){
        if (instance == null) {
            instance = new InterfazPantallaPrincipal();
        }
        return instance;
    }

    public void imprimirCantVisitantes(int cantidadDeVisitantes){
        this.cantidadDeVisitantes=cantidadDeVisitantes;
        System.out.println("Pantalla Principal: La cantidad de visitantes de la sede es:"+this.cantidadDeVisitantes);
    }
}
