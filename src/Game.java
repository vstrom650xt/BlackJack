public class Game {
 private  Baraja baraja;
 private Jugador[] players;
 private Jugador pc;

 public Game(Jugador[] jugador){
  baraja = new Baraja();
  this.players = jugador;
  pc = new Jugador("PC");



 }

 public  void start(){
     baraja.shuffle();
     for (Jugador player:players ) {
         //juegaJugador(jugador);
         //juegaPc();
         //mostrarganador();
     }
 }

}
