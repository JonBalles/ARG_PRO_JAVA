package ejemplo;

public class Ejemplo {

    public static void main(String[] args) {
    
        //Si invoco el constructor vacio los datos son null
        // Persona maria = new Persona();
        
        // nombre, apellido, edad
        Persona maria = new Persona("Maria", "Alvarez", 38);
        maria.saludar();
        maria.setNombre("Juana");
        maria.saludar();
        System.out.println("La edad de " + maria.getNombre() + " es " + maria.getEdad());
    }
    
}
