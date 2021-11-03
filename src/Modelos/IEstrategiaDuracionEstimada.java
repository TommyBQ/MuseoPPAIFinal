package modelos;

import java.util.Date;
public interface IEstrategiaDuracionEstimada {
     float calcularDuracionVisita(Sede s, Exposicion[] exp , Date fecha);
}
