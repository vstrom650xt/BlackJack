package Enumeradores;

import com.diogonunes.jcolor.Attribute;
//EN LOS ENUMS LOS CONSTRUCTORES SON PRIVADOS SIEMPRE PORQUE LOS ENUMS SIEMPRE SON PRIVADOS
public enum Colores {
    RED(Attribute.RED_TEXT()),
    BLACK(Attribute.BLACK_TEXT());


    public Attribute getColor() {
        return color;
    }

    private Attribute color;


    @Override
    public String toString() {
        return "Colores{" +
                "color=" + color +
                '}';
    }

    private  Colores(Attribute color) {
      this.color=color;
    }

}
