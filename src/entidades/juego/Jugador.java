/*
 disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package entidades.juego;

public class Jugador {

    private String ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverdeAgua r) {

        if (r.mojar() == true)
        {
            return this.mojado = true;
        } else
        {
            r.siguienteChorro();
            return this.mojado=false;
        }
    }

}
