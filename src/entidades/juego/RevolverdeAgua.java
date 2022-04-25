/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidades.juego;

public class RevolverdeAgua {
   private int posicionActual;
   private int prosicionAgua;

    public RevolverdeAgua() {
    }

    public RevolverdeAgua(int posicionActual, int prosicionAgua) {
        this.posicionActual = posicionActual;
        this.prosicionAgua = prosicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getProsicionAgua() {
        return prosicionAgua;
    }

    public void setProsicionAgua(int prosicionAgua) {
        this.prosicionAgua = prosicionAgua;
    }
   
 
  public void llenarRevolver(){
      this.posicionActual= (int) (Math.random()*6+1);
      this.prosicionAgua=(int) (Math.random()*6+1);
  }
  
  public boolean mojar(){
       return this.posicionActual==this.prosicionAgua;
  }
  
  public void siguienteChorro(){
      if (this.posicionActual<6)
      {
          this.posicionActual=this.posicionActual+1;
      }else if (this.posicionActual==6){
          this.posicionActual=1;
      }
      
  }

    @Override
    public String toString() {
        return "RevolverdeAgua{" + "posicionActual=" + posicionActual + ", prosicionAgua=" + prosicionAgua + '}';
    }
  
  
  
}
