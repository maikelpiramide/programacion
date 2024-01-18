public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre,String tipo, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPrice(double newPrice){
        this.precio = newPrice;
    }

    public int getCode(){
        return this.codigo;
    }

    @Override
    public String toString() {
        String texto =  "Producto{" + "\n" +
                "  codigo= " + codigo + "\n" +
                "  nombre= '" + nombre + '\n' +
                "  tipo= '" + tipo + '\n' +
                "  precio= " + precio + "€" + "\n" +
                "  stock= " + stock + "\n" +
                "\n}";
        return texto;
    }
}
