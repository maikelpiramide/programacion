public class App {
    public static void main(String[] args) {
        ArrayProducto auriculares = new ArrayProducto("auriculares");
        Producto producto1 = new Producto(123,"prueba01","auriculares",39.99,100);
        Producto producto2 = new Producto(1234,"prueba02","auriculares",39.99,100);
        Producto producto3 = new Producto(12345,"prueba03","auriculares",39.99,100);
        auriculares.addProduct(producto1);
        auriculares.addProduct(producto2);
        auriculares.addProduct(producto3);
        auriculares.getProductsList();
        //auriculares.deleteProduct(producto2);
        //auriculares.getProductsList();
        auriculares.getProduct(1);
        auriculares.getSizeList();
        System.out.println();
        auriculares.searchProduct(123);
        //System.out.println(producto1.getCode());

        auriculares.setPriceProduct(1234,99.99);
        auriculares.searchProduct(1234);
    }
}
