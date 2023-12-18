import java.util.ArrayList;

public class ArrayProducto {
    private String nombreLista;
    private ArrayList<Producto> productos;

    public ArrayProducto(String nombreLista){
        this.nombreLista = nombreLista;
        this.productos = new ArrayList<Producto>();
    }

    public void addProduct(Producto producto){
        this.productos.add(producto);
    }

    public void deleteProduct(Producto producto){
        Boolean delete = this.productos.remove(producto);
        if(delete == true){
            System.out.println("El producto ha sido eliminado");
        }
        else{
            System.out.println("No se ha podido encontrar el producto en la lista");
        }
    }

    public void getProduct(int posicion){
        System.out.println(this.productos.get(posicion-1));
    }

    public void searchProduct(int codigo){
        //System.out.println("metodo searchProduct");
        this.productos.forEach(producto -> {
            //System.out.println("iteration");
            if(producto.getCode() == codigo) {
                //System.out.println("producto con codigo igual");
                System.out.println("El producto con códido " + codigo + " es \n" + producto);
            }
        });
    }
    public void setPriceProduct(int codigo, double precio){
        this.productos.forEach(producto -> {
            if(producto.getCode() == codigo){
                producto.setPrice(precio);
            }
        });
    }

    public void getProductsList(){
        System.out.println("*********************************************");
        System.out.println("Lista de los productos " + this.nombreLista);
        System.out.println("---------------------------------------------");
        this.productos.forEach(producto -> System.out.println(producto));
        System.out.println("*********************************************");
    }

    public void getSizeList(){
        System.out.println("El tamaño de la lista es " + this.productos.size());
    }



}
