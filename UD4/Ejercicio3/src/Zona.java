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

    public void venderEntradas(int numeroVentas){
        if(this.entradasPorVender == 0){
            System.out.println("no quedan entradas por vender");
            System.out.println("-------------------------------");
        } else if (this.entradasPorVender < numeroVentas) {
            System.out.println("quedan solo " + this.entradasPorVender + " entradas");
            System.out.println("-----------------------------------");
        }
        else{
            System.out.println("Aquí tiene sus " + numeroVentas + " entradas");
            System.out.println("----------------------------------------------");
            this.entradasPorVender -= numeroVentas;
        }

    }
}
