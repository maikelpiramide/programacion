package Ejercicio3;

public class Pelicula extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo,String autor, String formato, double duracion,String actorPrincipal,String actrizPrincipal) throws IllegalArgumentException{
        super(titulo,autor,formato,duracion);
            if(actorPrincipal == null && actrizPrincipal == null){
                throw new IllegalArgumentException("debe haber un actor o actriz principal en la pelicula " + titulo);
            }
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
    }
    public String getActorPrincipal(){
        return this.actorPrincipal;
    }
    public String getActrizPrincipal(){
        return this.actrizPrincipal;
    }
    @Override
    public String toString() {
        if(this.actrizPrincipal == null && this.actorPrincipal == null){
            return null;
        }
        String text =  super.toString() + "ActorPrincipal: " + this.actorPrincipal + ", ActrizPrincipal: " + this.actrizPrincipal + " }";
        return text;
    }
}
