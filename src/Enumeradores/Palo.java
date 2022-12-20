package Enumeradores;
import static  com.diogonunes.jcolor.Ansi.colorize;
public enum Palo {

    HEART("\u2665",Colores.RED),
    SPADE("\u2660",Colores.BLACK),
    DIAMOND("\u2666",Colores.RED),
    CLUB("\u2663",Colores.BLACK);

    String shape;
    Colores colores;

    @Override
    public String toString() {
        return  colorize(shape,colores.getColor());
    }

    Palo(String shape, Colores color){
        this.colores=color;
        this.shape=shape;

    }







}
