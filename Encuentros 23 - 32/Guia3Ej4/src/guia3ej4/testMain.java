
package guia3ej4;


public class testMain {
    /*
    Luego desde el método main de una clase TestJuego, se pide:
     Crear un Robot.
     Crear un Hombre y pasarle el Robot creado en el ítem anterior.
     Hacer que el Hombre juegue con el Robot.
     Crear otro Hombre y pasarle el mismo Robot
     Hacer que el último Hombre creado juegue con el Robot
    */
   
    public static void main(String[] args) {
      Robot R2D2 = new Robot();
      Hombre jon = new Hombre(R2D2);
      Hombre alex = new Hombre(R2D2);
      
      /*jon.JugarConRobot(R2D2);
        System.out.println("*-----------*");*/
      alex.JugarConRobot(R2D2);
      
    }

}
