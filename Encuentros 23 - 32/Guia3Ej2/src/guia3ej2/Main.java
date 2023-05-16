/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia3ej2;


public class Main {

   
    public static void main(String[] args) {
        //nombre, direecion, cuit
        Kiosco local = new Kiosco("El novato","Calle falsa 123",23232521);
        //nombre, apellido, dni, fecha de ingreso(yyyy-MM-dd)
        Empleado turro1 = new Empleado("Jon","Balles",39393939, "2021-05-26");
        Empleado turro2 = new Empleado("Ed","Sheran",39393939, "2021-05-26");
        Empleado turro3 = new Empleado("Neo","Matriz",39393939,"2021-05-26");
        Empleado turro4 = new Empleado("Alan","Brito",39393939, "2020-02-10");
        Empleado turro5 = new Empleado("Alan","Brito",39393939, "2021-12-06");
        
        
        
        local.contratar(turro1);
        System.out.println(local.getEmpleado1());
        local.contratar(turro2);
        System.out.println(local.getEmpleado2());
        local.contratar(turro3);
        System.out.println(local.getEmpleado3());
        local.contratar(turro4);
        System.out.println("*---------------*");
        local.Antiguedad();
    }

}
