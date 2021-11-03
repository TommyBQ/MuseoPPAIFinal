package modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sede{
    private int cantMaximaVisitantes;
    private int cantMaxPorGuia;
    private String nombre;
    public Tarifa[] tarifas;
    private Exposicion[] exposiciones;
    private HorarioSede[] horarioSedes;
    private Planta[] plantas;
    private Empleado[] empleados;
    private Coleccion[] coleccions;
    private Deposito deposito;
    public static Tarifa[] tarifas3;
    public static LocalDate hoy;
    public static int i=0;
    private float duracion;
    private int cantidadDeVisitantes;

    public Sede() {
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposiciones, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] colecciones, Deposito deposito, Tarifa[] tarifas1) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposiciones = exposiciones;
        this.horarioSedes = horarioSedes;
        this.plantas = plantas;
        this.empleados = empleados;
        this.coleccions = colecciones;
        this.deposito = deposito;
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposiciones, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] coleccions, Deposito deposito, float duracion, int cantidadDeVisitantes) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposiciones = exposiciones;
        this.horarioSedes = horarioSedes;
        this.plantas = plantas;
        this.empleados = empleados;
        this.coleccions = coleccions;
        this.deposito = deposito;
        this.cantidadDeVisitantes = cantidadDeVisitantes;
    }

    public int getCantMaximaVisitantes() {
        return cantMaximaVisitantes;
    }

    public void setCantMaximaVisitantes(int cantMaximaVisitantes) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
    }

    public int getCantMaxPorGuia() {
        return cantMaxPorGuia;
    }

    public void setCantMaxPorGuia(int cantMaxPorGuia) {
        this.cantMaxPorGuia = cantMaxPorGuia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarifa[] getTarifas() {
        return tarifas;
    }

    public void setTarifas(Tarifa[] tarifas) {
        this.tarifas = tarifas;
    }

    public Exposicion[] getExposiciones() {
        return exposiciones;
    }

    public void setExposicions(Exposicion[] exposicions) {
        this.exposiciones = exposicions;
    }

    public HorarioSede[] getHorarioSedes() {
        return horarioSedes;
    }

    public void setHorarioSedes(HorarioSede[] horarioSedes) {
        this.horarioSedes = horarioSedes;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Coleccion[] getColeccions() {
        return coleccions;
    }

    public void setColeccions(Coleccion[] coleccions) {
        this.coleccions = coleccions;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "cantMaximaVisitantes=" + cantMaximaVisitantes +
                ", cantMaxPorGuia=" + cantMaxPorGuia +
                ", nombre='" + nombre + '\'' +
                ", tarifas=" + Arrays.toString(tarifas) +
                ", exposicions=" + Arrays.toString(exposiciones) +
                ", horarioSedes=" + Arrays.toString(horarioSedes) +
                ", plantas=" + Arrays.toString(plantas) +
                ", empleados=" + Arrays.toString(empleados) +
                ", coleccions=" + Arrays.toString(coleccions) +
                ", deposito=" + deposito +
                '}';
    }

    public  Tarifa[] conocerTarifa(){
        System.out.println();
        Tarifa[] tarifas;
        tarifas=Tarifa.conocerTarifa();

        hoy=LocalDate.of(2021,8,21);
        List<Tarifa> list=new ArrayList<>();
        for(Tarifa e:tarifas){
            if((hoy.isBefore(e.fechaFinVigencia)||hoy.equals(e.fechaFinVigencia)) && (hoy.isAfter(e.fechaInicioVigencia)||hoy.equals(e.fechaInicioVigencia))){
                list.add(e);

                i++;
            }

        }
        tarifas3=new Tarifa[list.size()];
        list.toArray(tarifas3);

        return tarifas3;
    }

    private void loadExposiciones(){

            // Cargo tipos de exposiciones
            TipoExposicion[] tipoExposicion = new TipoExposicion[4];
            tipoExposicion[0]= new TipoExposicion("Exposición guiada permanente","Con guía" , true );
            tipoExposicion[1]= new TipoExposicion("Exposición guiada temporal","Temporal con guía" ,  false);
            tipoExposicion[2]= new TipoExposicion("Exposición sin guía permanente","Sin guía" ,  true);
            tipoExposicion[3]= new TipoExposicion("Exposición sin guía temporal ","Temporal Sin guia" ,  false);

            Cargo[] cargos=new Cargo[2];
            cargos[0]=new Cargo("Responsable de Obra","Responsable");
            cargos[1]=new Cargo("Responsable de Obra","Responsable");
            DiaSemana[] diaSemanas=new DiaSemana[7];
            diaSemanas[0]=new DiaSemana("Lunes");
            diaSemanas[1]=new DiaSemana("Martes");
            diaSemanas[2]=new DiaSemana("Miercoles");
            diaSemanas[3]=new DiaSemana("Jueves");
            diaSemanas[4]=new DiaSemana("Viernes");
            diaSemanas[5]=new DiaSemana("Sabado");
            diaSemanas[6]=new DiaSemana("Domingo");


            HorarioEmpleado[] horarioEmpleados=new HorarioEmpleado[2];
            horarioEmpleados[0]=new HorarioEmpleado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),diaSemanas);
            horarioEmpleados[1]=new HorarioEmpleado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),diaSemanas);
            Empleado[] empleados=new Empleado[2];
            empleados[0]=new Empleado("sanchez","25","20202020","32333652","Ubicacion 14",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe@gmail.com","Pepe","Masculino","25121151",cargos[0],horarioEmpleados[0]);
            empleados[1]=new Empleado("sanchez","25","20202020","32333652","Ubicacion 14",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe@gmail.com","Pepe","Masculino","25121151",cargos[0],horarioEmpleados[0]);
            Tecnica[] tecnicas=new Tecnica[2];
            tecnicas[0]=new Tecnica("Claro Oscuro","Oleo");
            tecnicas[1]=new Tecnica("Claro Oscuro","Oleo");
            Tematica[] tematicas=new Tematica[2];
            tematicas[0]=new Tematica("Claro Oscuro");
            tematicas[1]=new Tematica("Claro Oscuro");
            Estilo[] estilos=new Estilo[2];
            estilos[0]=new Estilo("Claro Oscuro","dos");
            estilos[1]=new Estilo("Claro Oscuro","uno");
            TipoIngreso[] tipoIngresos=new TipoIngreso[2];
            tipoIngresos[0]=new TipoIngreso("descrip","uno");
            tipoIngresos[1]=new TipoIngreso("descrip","dos");
            SectorDeposito[]sectorDepositos = new SectorDeposito[2];
            sectorDepositos[0]=new SectorDeposito("uno");
            sectorDepositos[1]=new SectorDeposito("dos");
            Compra[] compras = new Compra[2];
            compras[0]=new Compra(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000);
            compras[1]=new Compra(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000);
            Artista[] artistas = new Artista[2];
            artistas[0]=new Artista("uno","Leonardo","Da vinci","Leo","Masculino","23235");
            artistas[1]=new Artista("uno","Leonardo","Da vinci","Leo","Masculino","23235");
            Especialidad[] especialidades = new Especialidad[2];
            especialidades[0]=new Especialidad("Descripcion uno","Uno",estilos[0],tecnicas[0]);
            especialidades[1]=new Especialidad("Descripcion uno","Uno",estilos[0],tecnicas[0]);

            Restaurador[] restauradores=new Restaurador[2];
            restauradores[0]=new Restaurador("Argento","pepe","Avenida Siempre Viva","sdadasd@gmail.com","315646465",especialidades);
            restauradores[1]=new Restaurador("Argento","pepe","Avenida Siempre Viva","sdadasd@gmail.com","315646465",especialidades);
            TipoRestauracion[] tipoRestauraciones=new TipoRestauracion[2];
            tipoRestauraciones[0]=new TipoRestauracion("Descripcion uno","uno");
            tipoRestauraciones[1]=new TipoRestauracion("Descripcion uno","uno");

            Restauracion[] restauraciones = new Restauracion[2];
            restauraciones[0]=new Restauracion("Descripcion uno",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000,restauradores[0],tipoRestauraciones[0]);
            restauraciones[1]=new Restauracion("Descripcion uno",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000,restauradores[0],tipoRestauraciones[0]);

            Archivo[] archivos=new Archivo[2];
            archivos[0]=new Archivo("Uno","ubicacion uno");
            archivos[1]=new Archivo("Uno","ubicacion uno");
            Donador[] donadores=new Donador[2];
            donadores[0]=new Donador("Jose");
            donadores[1]=new Donador("Jose");


            Donacion[] donaciones=new Donacion[2];
            donaciones[0]=new Donacion(LocalDate.of(2021,9,22),donadores[0]);
            donaciones[1]=new Donacion(LocalDate.of(2021,9,22),donadores[0]);
            Estado[] estados = new Estado[2];
            estados[0]=new Estado("Obra","En Restauracion","En Restauracion");
            estados[1]=new Estado("Obra","En Restauracion","En Restauracion");

            CambioDeEstado[] cambioDeEstados = new CambioDeEstado[2];
            cambioDeEstados[0]=new CambioDeEstado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),estados[0]);
            cambioDeEstados[1]=new CambioDeEstado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),estados[0]);

            Museo[] museos=new Museo[2];
            museos[0]=new Museo("Avenida Siemrpe Viva","Uno","5654646");
            museos[1]=new Museo("Avenida Siemrpe Viva","Uno","5654646");

            PrestamoAMuseo[] prestamoAMuseos = new PrestamoAMuseo[2];
            prestamoAMuseos[0]=new PrestamoAMuseo(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe", LocalTime.now(),museos[0]);
            prestamoAMuseos[1]=new PrestamoAMuseo(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe", LocalTime.now(),museos[0]);

            Obra[] obras=new Obra[4];
            obras[0]=new Obra(20,20,5,"hola mundo",30,20,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
            obras[1]=new Obra(20,20,5,"hola mundo",30,30,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
            obras[2]=new Obra(20,20,5,"hola mundo",30,40,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
            obras[3]=new Obra(20,20,5,"hola mundo",30,50,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);

            Pared[] paredes=new Pared[2];
            paredes[0]=new Pared("Uno",20,20);
            paredes[1]=new Pared("Uno",20,20);

            DetalleExposicion[] detalleExposiciones = new DetalleExposicion[4];
            detalleExposiciones[0]=new DetalleExposicion("lugar1",obras[0],paredes[0]);
            detalleExposiciones[1]=new DetalleExposicion("lugar1",obras[1],paredes[1]);
            detalleExposiciones[2]=new DetalleExposicion("lugar1",obras[2],paredes[0]);
            detalleExposiciones[3]=new DetalleExposicion("lugar1",obras[3],paredes[1]);

            PublicoDestino[] publicoDestinos=new PublicoDestino[2];
            publicoDestinos[0]=new PublicoDestino("Caracteristica uno"," uno");
            publicoDestinos[1]=new PublicoDestino("Caracteristica uno"," uno");

            Exposicion[] expos=new Exposicion[4];
            expos[0]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,5,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 1",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
            expos[1]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,4,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 2",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
            expos[2]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,4,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 3",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
            expos[3]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 4",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);

           this.exposiciones = expos;

    }
    public Exposicion[] conocerExposicion(){
        if ( this.exposiciones.length == 0 ){
            this.loadExposiciones();
        }
        return this.exposiciones;
    }

    public float getDuracion(){
        List<Exposicion> list=new ArrayList<>();

        float resultado_duracion = 0.0F;
        if ( this.exposiciones.length == 0){
            this.loadExposiciones();
        }
        for(Exposicion e: this.exposiciones){
            if(e.esVigente()){
                list.add(e);
            }
        }
        for( Exposicion vigente: list){
            resultado_duracion= resultado_duracion + vigente.getDuracion();
        }

        return resultado_duracion;
    }

    public float getDuracionv2(){
        List<Exposicion> list=new ArrayList<>();

        float resultado_duracion = 0.0F;
        if ( this.exposiciones.length == 0){
            this.loadExposiciones();
        }
        for(Exposicion e: this.exposiciones){
            if(e.esVigente()){
                list.add(e);
            }
        }
        for( Exposicion vigente: list){
            resultado_duracion= resultado_duracion + vigente.getDuracion();
        }

        return resultado_duracion;
    }

    public void imprimirCantVisitantes(int cantidadDeVisitantes){
        this.cantidadDeVisitantes=cantidadDeVisitantes;

        for(Planta a:plantas){
            a.imprimirCantVisitantes(this.cantidadDeVisitantes);
        }
    }
}