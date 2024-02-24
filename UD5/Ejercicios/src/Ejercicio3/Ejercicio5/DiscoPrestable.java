package Ejercicio3.Ejercicio5;

public class DiscoPrestable extends Ejercicio3.Disco implements Prestable{
    private boolean prestado = false;
    private static int cuentaPrestados = 0;
    public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion, genero);
    }

    @Override
    public void prestar() {
        this.prestado = true;
        cuentaPrestados++;
    }
    public static int cuentaPrestados(){
        return cuentaPrestados;
    }
}
