import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta[] mano;



    public Jugador(String nombre){
        this.nombre = nombre;
        mano = new Carta[0];

    }


    public String getNombre(){

        return nombre;
    }

    public String setNombre(String nombre){
        return nombre;
    }
    public int getPunt(){
        int points = 0 ;
//////////////////////////repasar esto*///////////////////
        for (Carta carta : mano){
            points += carta.getValor().getPuntuacion()[0];

        }
        return (points > 21) ? -1 : points;
    }
    public void addCart(Carta carta){
        Carta[]aux = new Carta[mano.length+1];
        for (int i = 0; i < mano.length; i++) {
            aux[i]=mano[i];
        }
        aux[aux.length-1] = carta;
        mano = aux;


    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + Arrays.toString(mano) +
                '}' + "\n puntuacion :"+ getPunt();
    }
}
