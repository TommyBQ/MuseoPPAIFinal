package modelos;

import java.util.ArrayList;
import java.util.Date;

public class EstrategiaVisitaCompleta implements IEstrategiaDuracionEstimada {


    public EstrategiaVisitaCompleta(){

    }

    @Override
    public float calcularDuracionVisita(Sede s, Exposicion[] exp , Date fecha) {

        //
        // debe retornar duración completa
        float duracion_total = 0.0F;
        ArrayList<Exposicion> exp_vigentes = new ArrayList<Exposicion>();
        // busco todas las exposiciones porque es una visita completa
        for( Exposicion e : s.conocerExposicion()){
            // armo el array de exp vigentes
            if ( e.esVigente() ) {
                exp_vigentes.add(e);
            }
        }
        for( Exposicion ev : exp_vigentes){
            DetalleExposicion[] detalle_list = ev.getDetalleExposicions();
            // busco la duración de cada obra de la exposición
            for ( DetalleExposicion de : detalle_list){
                duracion_total = duracion_total + de.sumarDuracionResumida();
            }
        }

        return duracion_total;
    }
}
