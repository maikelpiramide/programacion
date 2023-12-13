public class CD {
    private Cancion[] canciones;
    private int contador;

    public CD(){
        this.canciones = new Cancion[5];
    }

    public void numeroCanciones(){
        for(Cancion i : canciones){
            if(i != null){
                contador ++;
            }else{
                break;
            }
        }
        System.out.println("El numero de canciones es: " + this.contador);
    }
    public void dameCancion(int position){
        if(this.canciones[position-1] == null){
            System.out.println("No existe ninguna canción en esa posición");
        }
        else{
            System.out.println("La canción es: \n" + this.canciones[position-1]);
        }
    }
    public void agregaCancion(Cancion cancion){
        for(int i = 0 ; i < this.canciones.length; i++){
            if(this.canciones[i] == null){
                this.canciones[i] = cancion;
                break;
            }
        }
    }

    public void grabaCancion(int pos, Cancion cancion){
        this.canciones[pos] = cancion;
    }

    public void elimina(int pos){

        this.canciones[pos-1] = null;
        for(int i = 0; i < this.canciones.length -1; i++ ){
            if(this.canciones[i] == null) {
                Cancion aux = this.canciones[i];
                this.canciones[i] = this.canciones[i+1];
                this.canciones[i+1] = aux;
            }
        }
        /*for(Cancion i : this.canciones){
            System.out.println(i);
        }*/
    }
    public void verTodasCanciones(){
        for (Cancion i : this.canciones){
            if(i != null) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}
