package guia5pt2ej5;


public class Guia5pt2Ej5 {

    /*
     Luego desde el método main de 
una clase Test, nos piden:
 Instanciar un Colegio.
 Definir un bucle que crea un objeto Alumno pidiéndole al usuario todos sus datos y 
guardándolos en el objeto Alumno. Después, ese Alumno se guarda en el Colegio usado 
el método de Colegio que usted implementó y se le pregunta al usuario si quiere crear otro
Alumno o no. 
 Quitar uno de los alumnos cargados.
 Listar los alumnos ordenados por apellido.
 Listar los alumnos cuyo apellido comience con la letra que el usuario ingresará por teclado.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java
    */
   
    public static void main(String[] args) {
        
        Alumno al1 = new Alumno("Pepito", "tito" ,2000, 123);
        Alumno al2 = new Alumno("fulanito", "otro" ,2001, 124);
        Alumno al3 = new Alumno("cosme", "x" ,1999, 125);
        
        Colegio escuela = new Colegio("una");
        
        escuela.AgregarAlumno();
        escuela.AgregarAlumno();
 
        //escuela.listarAlumnos();
        
        escuela.QuitarAlumno();
        
        //escuela.listarAlumnos();
        
        
        
        
        
        
    }

}
