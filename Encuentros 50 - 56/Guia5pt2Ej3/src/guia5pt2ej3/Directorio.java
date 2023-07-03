package guia5pt2ej3;

/*
    . El directorio está compuesto por el número de teléfono y los datos 
del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando 
agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es 
único) 
El directorio telefónico posee además las siguientes funcionalidades: 
● agregarCliente(nroTel, Cliente):void  que permite registrar un nuevo cliente con su 
respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo. 
● buscarCliente(nroTel):Cliente  que en base al nro de teléfono retorna el Cliente asociado al 
mismo. 
● buscarTeléfono(apellido):List  que en base a un apellido nos devuelve una lista con los nros. 
de teléfono asociados a dicho apellido. 
● buscarClientes(ciudad):List  que en base a una ciudad nos devuelve una lista con los 
Clientes asociados a dicha ciudad. 
● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio. 
*/
public class Directorio {
private long telefono;
private Cliente cliente;

    public Directorio() {
        
    }




}
