package Ejercicio2;

public abstract class Producto {
    private final String codigoBarras;
    private String nombre;
    private final String material;
    private double precio;


    Producto(String codigoBarras, String nombre, String material, double precio){
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double calcularIva(double iva);

    @Override
    public String toString() {
        return "Producto{" +
                "codigoBarras='" + codigoBarras + '\'' +
                ", nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", precio=" + precio +
                '}';
    }
}
