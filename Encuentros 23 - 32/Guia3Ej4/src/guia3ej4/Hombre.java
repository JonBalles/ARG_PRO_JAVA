/*
Por otro lado el Hombre sabe:
• JugarConRobot(Robot) Este método recibe por parámetro un Robot y con hace lo siguiente:
 Hacer que el Robot Avance 500 pasos. 
 El robot Retroceda 20 pasos. 
 Informe por pantalla cuanta energía tiene el robot Actualmente. 
 Ponga el robot a dormir.
 */

package guia3ej4;

import java.util.Scanner;


public class Hombre {
 private Robot robot;
 
 public Hombre(Robot robot){
     this.robot= robot;
 }
 
 public void JugarConRobot(Robot robot){
     Scanner leer = new Scanner(System.in);
     System.out.println("Bienvenido!");
     System.out.println("Prende el robot para empezar a usarlo");
     
     
     do{
        System.out.println("*--------------------*");
        System.out.println("Que deseas hacer con el robot?");
        System.out.println("1 - Encender");
        System.out.println("2 - Avanzar");
        System.out.println("3 - Retroceder");
        System.out.println("4 - Ver bateria");
        System.out.println("5 - Apagar");
     
     switch(leer.nextInt()){
         case 1:
             robot.despertar();
             break;
         case 2:
             System.out.println("Cuantos pasos avanzas?");
             robot.avanzar(leer.nextInt());
             break;
         case 3:
             System.out.println("Cuantos pasos retrocedes?");
             robot.retroceder(leer.nextInt());
             break;
         case 4:
             System.out.println(robot.BateriaActual());
             break;
         case 5:
             robot.dormir();
             break;
         default:
             System.out.println("Opcion invalida");
     }
     }while(robot.getEncendido());
     System.out.println("Robot apagado");
 }
}
