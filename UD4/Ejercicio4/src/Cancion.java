public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }

    public void dameTitulo(){
        System.out.println("-----------");
        System.out.println(this.titulo);

    }
    public void dameAutor(){

        System.out.println(this.autor);
        System.out.println("-----------");
    }

    public void ponTitulo(String titulo){
        this.titulo = titulo;
    }
    public void ponAutor(String autor){
        this.autor = autor;
    }
}
