package VistasFX;

import Modelos.Entrada;

public class InterfazImpresora {
    private static InterfazImpresora instance;

    public static InterfazImpresora getInstance(){
        if (instance == null) {
            instance = new InterfazImpresora();
        }
        return instance;
    }

    public void imprimir(Entrada[] entradas){
        System.out.println("SE IMPRIMEN LAS ENTRADAS :D");

        for(Entrada e:entradas) {
            System.out.println("Numero:"+e.getNumero()+"\n"+"Fecha de Venta: :"+e.getFechaVenta()+"\n"+"Hora de Venta: "+e.getHoraVenta()+"\n"+"Tipo de Entrada: "+e.getTarifa().getTipoDeEntrada().getNombre()+"\n"+"Tipo de Visita: "+e.getTarifa().getTipoVisita().getNombre()+"\n"+"Monto: "+e.getMonto()+"\n");
        }
    }

}
