package ejercicio1;

public class Ejercicio1 {

   
    public static void main(String[] args) {
        Producto uno= new Producto(123,"Soy un producto", 2.99, 5);
        
        System.out.println("Descripcion del producto: " + uno.getDescripcion());
        System.out.println("Su precio es: " + uno.getPrecio());
        System.out.println("Stock: " + uno.getStock());
        System.out.println("Codigo: " + uno.getCodigo());
    }
    
}
