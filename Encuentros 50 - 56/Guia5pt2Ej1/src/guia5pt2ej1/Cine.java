package guia5pt2ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new ArrayList();
    }

    public void agregarPelicula(Pelicula nueva) {
        proyecciones.add(nueva);
        System.out.println("Agregado exitosamente");
    }

    public void listarTodo() {
        //Ciclo for comun para iterar un arraylist
        for (int i = 0; i < proyecciones.size(); i++)
        {
            System.out.println(proyecciones.get(i));
        }

        System.out.println("*---------*");

        //Ciclo Foreach para iterar ArrayList
        for (Pelicula proyeccion : proyecciones)
        {
            System.out.println(proyeccion);
        }
    }

    public void listarDuranMas(int horas) {
        System.out.println("Peliculas que duran mas de: " + horas + " horas");
        System.out.println("*-------*");

        for (Pelicula proyeccion : proyecciones)
        {

            if ((proyeccion.getDuracion() / 60) >= horas)
            {
                System.out.println(proyeccion.getTitulo());
            }
        }

    }

    public void listarMenorDuracionAMayor() {
        Comparator<Pelicula> orden = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                if (p1.getDuracion() < p2.getDuracion())
                {
                    return -1;
                }
                if (p1.getDuracion() == p2.getDuracion())
                {
                    return 0;
                }
                return 1;
            }
        };
        
        Collections.sort(proyecciones, orden);
        
        System.out.println(proyecciones);
    }

    
    public void listarOrdenadasPorTituloAZ(){
        Comparator<Pelicula> orden = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        Collections.sort(proyecciones, orden);
        System.out.println(proyecciones);
     }
    
       public void listarOrdenadasPorDirectorAZ(){
        Comparator<Pelicula> orden = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
            }
        };
        Collections.sort(proyecciones, orden);
        System.out.println(proyecciones);
     }
    
}

