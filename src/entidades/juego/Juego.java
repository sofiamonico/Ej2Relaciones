/*
 llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidades.juego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Juego {
   private List<Jugador> jugadores;
   private RevolverdeAgua revolver;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, RevolverdeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverdeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverdeAgua revolver) {
        this.revolver = revolver;
    }
   
   public void llenarJuego(ArrayList<Jugador> jugadores, RevolverdeAgua r){
       this.jugadores=jugadores;
       this.revolver=r;
   }
   
   public void ronda(){
       Iterator<Jugador> it= this.jugadores.iterator();
       boolean seguir=true;
       while(seguir){
           while(it.hasNext()){
               Jugador j=it.next();
               if (j.disparo(revolver)==true)
               {
                   seguir=false;
                   System.out.println("El jugador: " + j.getNombre() + " fue mojado. FIN DEL JUEGO");
                   break;
               }else{
                   System.out.println("EL JUGADOR: " +j.getNombre() +" NO SE MOJÓ , SIGUIENTE RONDA");
                   System.out.println("--------------------------------------------------------------");
               }
           }
           it=this.jugadores.iterator();
       }
       

   }
}
