package guia5pt2ej1;

import javax.swing.JOptionPane;


public class Guia5pt2Ej1 {

   
    public static void main(String[] args) {
        // Crear el Cine ROMA SRL, ubicado en Rivadavia 325.
        
        Cine hoyts = new Cine ("ROMA SRL", "Rivadavia 325");
        Pelicula jonwik = new Pelicula("John Wick", "Enrique segoviano", 130);
        Pelicula jurasic = new Pelicula("Jurassic Park", "Enrique segoviano", 110);

        hoyts.agregarPelicula(jonwik);
        hoyts.agregarPelicula(jurasic);
        System.out.println("*---------------------*");
        /*
         Definir un bucle que crea un objeto Película pidiéndole al usuario todos sus datos y 
    guardándolos en el objeto Película. Después, esa Película se guarda en el Cine usado su 
    método agregarPelicula y se le pregunta al usuario si quiere crear otra Película o no. 
        */
        String on = "s", titulo, director;
        int duracion, N;
        N=0;
        on = JOptionPane.showInputDialog(null, "Ingresar una pelicula? S/N");
        while("s".equalsIgnoreCase(on)){
            
            titulo = JOptionPane.showInputDialog(null, "Ingrese Titulo");
            director = JOptionPane.showInputDialog(null, "Ingrese Director");
            duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese duracion"));
            
           Pelicula npelicula = new Pelicula(titulo, director, duracion);
           hoyts.agregarPelicula(npelicula);
           on = JOptionPane.showInputDialog(null, "Ingresar otra pelicula? S/N");
        };
        System.out.println("*---------------------*");
        
   //  Pedir al Cine que liste las películas que duren más de x cantidad de horas que el usuario ingresará por teclado.
        
   
   
   hoyts.listarDuranMas(Integer.parseInt(JOptionPane.showInputDialog(null, "Minimo de duracion de pelicula que busca")));
        System.out.println("*---------------------*");
  //   Pedir al cine que liste todas las películas.
        hoyts.listarTodo();
        System.out.println("*---------------------*");
        
   // Pedir al cine que liste las películas ordenadas por título.
        hoyts.listarOrdenadasPorTituloAZ();
        System.out.println("*---------------------*");
        
   //  Pedir al cine que liste las películas ordenadas por director.
        hoyts.listarOrdenadasPorDirectorAZ();
        System.out.println("*---------------------*");
   // Pedir al cine que liste las películas ordenadas por duració    
        hoyts.listarMenorDuracionAMayor();
        System.out.println("*---------------------*");
    }

}
