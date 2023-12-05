public class Zona {
    private int entradasPorVender;
    private String nombreZona;

    public Zona(String zona,int numeroEntradas){
        this.entradasPorVender = numeroEntradas;
        this.nombreZona = zona;
    }

    public void verEntradas(){
        System.out.println("quedan " + this.entradasPorVender + " entradas de la " + this.nombreZona );
    }
}
