import Enumeradores.Palo;
import Enumeradores.Valor;

public class Carta {

    private Palo palo;
    private Valor valor;



    public Carta(Palo palo, Valor valor){
        this.palo=palo;
        this.valor=valor;

    }
    public Valor getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "["  + valor +
                "," + palo +
                ']';
    }


}
