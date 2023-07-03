package guia5pt2ej5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
Un Colegio nos pide un sistema para llevar un registro de los alumnos que se encuentran 
cursando actualmente. 
     El sistema debe permitir agregar alumnos al Colegio sin que se repitan, quitar alumnos 
en base a su legajo, listar los alumnos ordenados alfabéticamente por su apellido y listar los 
alumnos cuyos apellidos comiencen por un carácter en particular.
 */
public class Colegio {

    Scanner leer = new Scanner(System.in);
    private String escuela;
    private TreeSet<Alumno> alumnos = new TreeSet(ordenarPorApellido);

    public Colegio(String escuela) {
        this.escuela = escuela;
    }

    public static Comparator<Alumno> ordenarPorApellido = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno uno, Alumno dos) {
            return uno.getApellido().compareTo(dos.getApellido());
        }
    };

    public void AgregarAlumno() {

        int legajo;

        System.out.println("Nombre del alumno");
        String nombre = leer.next();
        System.out.println("Apellido del alumno");
        String apellido = leer.next();
        System.out.println("Año de nacimiento del alumno");
        int año = leer.nextInt();
        if (alumnos.size() <= 0)
        {
            legajo = 100;
        } else
        {
            Alumno ultimo = alumnos.last();
            legajo = (ultimo.getLegajo() + 1);
        }
        Alumno nuevo = new Alumno(nombre, apellido, año, legajo);

        alumnos.add(nuevo);

        System.out.println("Alumno ingresado correctamente");
        System.out.println("*-----------------------*");
    }

    public void listarAlumnos() {
        for (Alumno a : alumnos)
        {
            System.out.println(a);
        }
    }

    public void QuitarAlumno() {
        System.out.println("Ingrese numero de legajo a eliminar");
        int legajo = leer.nextInt();

        Alumno aEliminar = alumnos.floor(new Alumno("a", "a", 0, legajo));

        if (aEliminar != null && aEliminar.getLegajo() == legajo)
        {
            System.out.println("Esta seguro que desea eliminar a: " + aEliminar + "?");

        } else
        {
            Alumno objetoCeiling = alumnos.ceiling(new Alumno("a", "a", 0, legajo));
            if (objetoCeiling != null && objetoCeiling.getLegajo() == legajo)
            {
                System.out.println("Esta seguro que desea eliminar a: " + aEliminar + "?");
            } else
            {
                System.out.println("No se encuentra ese numero de legajo");
            }

        }
        
    }
}
