import Enumeradores.Palo;
import Enumeradores.Valor;

import java.util.*;

public class Baraja {
     private Carta []cartas;
    public Baraja() {
        cartas = new Carta[48];
        int j=0;
        for(Palo palo : Palo.values()){
            for (Valor valor : Valor.values()) {
                cartas[j++] = new Carta(palo,valor);
            }
        }
    }



    public   void shuffle(){
        List<Carta> listaCartas= Arrays.asList(cartas);
        Collections.shuffle(listaCartas);
        listaCartas.toArray();
    }
    public Carta showLastCard(){
        if (cartas.length>0)
            return cartas[0];
        return null;
    }

    public Carta showFirstCard() {
        if (cartas.length > 0)
            return cartas[cartas.length - 1];
        return null;
    }

    public Carta getFirstCard(){
        if(cartas.length==0)
            return null;

        Carta carta = cartas[0];
        Carta[] aux = new Carta[cartas.length-1];

        for(int i=0;i<aux.length;i++)
            aux[i]=cartas[i+1];

        cartas = aux;
        return carta;
    }


    public Carta getLastCard(){
        if(cartas.length==0)
            return null;

        Carta carta = cartas[cartas.length-1];
        Carta[] aux = new Carta[cartas.length-1];

        for(int i=0;i<aux.length;i++)
            aux[i]=cartas[i];

        cartas = aux;
        return carta;


    }


        @Override
    public String toString() {
        String barajaCadena ="";
        for(Carta carta : cartas)
            barajaCadena += carta.toString() + "\n";
        return barajaCadena;
    }

}
