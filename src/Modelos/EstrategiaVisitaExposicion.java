package modelos;

import java.util.ArrayList;
import java.util.Date;

public class EstrategiaVisitaExposicion implements IEstrategiaDuracionEstimada {
    public EstrategiaVisitaExposicion(){
    }
    @Override
    public float calcularDuracionVisita(Sede s, Exposicion[] exp , Date fecha ) {
        //
        // debe retornar duración completa
        float duracion_total = 0.0F;
        ArrayList<Exposicion> exp_vigentes = new ArrayList<Exposicion>();
        // busco solo las exposiciones seleccionadas
        for( Exposicion e : exp){
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
