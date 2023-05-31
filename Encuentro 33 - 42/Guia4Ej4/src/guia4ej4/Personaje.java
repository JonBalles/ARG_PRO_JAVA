package guia4ej4;

public abstract class Personaje {

    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'N';

    public Personaje(String nick, Position ubicacion) {
        this.nick = nick;
        this.ubicacion = ubicacion;
    }

    public void Disparar() {
        int disparo = 10;
        if (energia < 10 && (energia - disparo) <= 0)
        {
            System.out.println("No hay energia para disparar");
        } else
        {
            energia -= disparo;
            System.out.println("BANG!");
        }
    }

    public void Girar() {
        switch (orientacion)
        {
            case 'N':
                orientacion = 'E';
                System.out.println("Estas mirando al " + orientacion);
                break;
            case 'E':
                orientacion = 'S';
                System.out.println("Estas mirando al " + orientacion);
                break;
            case 'S':
                orientacion = 'O';
                System.out.println("Estas mirando al " + orientacion);
                break;
            case 'O':
                orientacion = 'N';
                System.out.println("Estas mirando al " + orientacion);
                break;
            default:
                break;
        }
    }

    public void avanzar() {
        switch (orientacion)
        {
            case 'N':
                ubicacion.setY(ubicacion.getY() + 1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX() + 1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY() - 1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX() - 1);
                break;
            default:
                break;
        }
    }

}
