public class Lugar {
    private String pais;
    private String ciudad;
    public Lugar (String pais,String ciudad){
        this.pais = pais;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return this.ciudad + ", " + this.pais;
    }
}
