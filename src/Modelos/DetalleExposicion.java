package modelos;

public class DetalleExposicion {
    private String lugarAsignado;
    private Obra obra;
    private Pared pared;
    public DetalleExposicion() {
    }

    public DetalleExposicion(String lugarAsignado, Obra obra, Pared pared) {
        this.lugarAsignado = lugarAsignado;
        this.obra = obra;
        this.pared = pared;
    }


    public String getLugarAsignado() {
        return lugarAsignado;
    }

    public void setLugarAsignado(String lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Pared getPared() {
        return pared;
    }

    public void setPared(Pared pared) {
        this.pared = pared;
    }



    @Override
    public String toString() {
        return "DetalleExposicion1{" +
                "lugarAsignado='" + lugarAsignado + '\'' +
                ", obra=" + obra +
                ", pared=" + pared +
                ", duracion_extendida =" + this.sumarDuracionExtendida() +
                ", duracion_resumida =" + this.sumarDuracionResumida() +
                '}';
    }

    public float sumarDuracionResumida(){
        return this.obra.getDuracionResumida();
    }

    public float sumarDuracionExtendida(){
        return this.obra.getDuracionResumida();

    }
}
