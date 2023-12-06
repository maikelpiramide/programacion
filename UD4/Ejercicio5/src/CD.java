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
}
