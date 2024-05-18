package Ejercicio2;

public class Camiseta extends Producto{

    private String talla;

    Camiseta(String codigoBarras, String nombre, String material, double precio, String talla){
        super(codigoBarras, nombre, material, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }


    @Override
    public double calcularIva(double iva) {

        return (this.getPrecio() * iva) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Talla: " + talla;
    }
}
