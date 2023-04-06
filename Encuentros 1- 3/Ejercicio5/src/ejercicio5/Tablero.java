package ejercicio5;


public class Tablero {

  
    public static void main(String[] args) {
       
        //Pieza, movimiento, captura, casillas, moveEsp
        Pieza torre = new Pieza("Torre", "Horizontal-Vertical", "Horizontal-Vertical", 8, true);
        torre.mostrarInfo();
        
        Pieza peon = new Pieza("Peon" , "Vertical" , "Diagonal" , 1 , true);
        peon.mostrarInfo();
        
        Pieza alfil = new Pieza("Alfil" , "Diagonal" , "Diagonal" , 8 , false);
        alfil.mostrarInfo();
        
        Pieza rey = new Pieza("Rey", "Todas las direcciones", "Todas las direcciones", 1 , true);
        rey.mostrarInfo();
        
        Pieza caballo = new Pieza("Caballo", "2 vertical 1 horizontal / 2 horizontal 1 vertical", "Igual que su desplazamiento", 3 , false);
        caballo.mostrarInfo();
        
        Pieza reina = new Pieza("Reina", "Todas las direcciones", "Todas las direcciones", 8 , false);
        reina.mostrarInfo();
    }
    
}
