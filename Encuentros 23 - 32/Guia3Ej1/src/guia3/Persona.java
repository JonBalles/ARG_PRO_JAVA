package guia3;

public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private int dni;

    private Perro [] perros = new Perro[3];
   

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre= nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

   public Object[] getPerros() {
        return perros;
    }

    public void setPerros(Perro[] perros) {
        this.perros = perros;
    }

     

    public void adoptarPerro(Perro perroNuevo) {
        // Iteracion dentro del array de perros
      for (int i = 0; i < perros.length; i++) {
          //Pregunto si en el indice que itera esta vacio.
        if (perros[i] == null) {
            //Si esta vacio, agrego el nuevo objeto perro
            perros[i] = perroNuevo;
            System.out.println("El perro " + perros[i].getNombre() + " ha sido adoptado");
            return;
        }
    }
    System.out.println("Disculpe, pero ya no puede adoptar mas perros.");
}
    
    public void perroMasGrande() {
        int mayor = 0;
        String viejo = "";
        for(int i = 0; i < perros.length ; i++){
            if(perros[i].getEdad() > mayor){
                mayor = perros[i].getEdad();
                viejo = perros[i].getNombre();
            }
        }
        System.out.println("El perro de mayor edad es: " + viejo);
    }
}
