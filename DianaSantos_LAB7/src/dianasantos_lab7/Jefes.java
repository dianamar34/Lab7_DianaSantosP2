
package dianasantos_lab7;

import java.util.ArrayList;


public class Jefes {
    private String seccion;
   ArrayList<empleados> mismaseccion = new ArrayList();
   private int ganancia;

    public Jefes() {
    }

    public Jefes(String seccion, int ganancia) {
        this.seccion = seccion;
        this.ganancia = ganancia;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
   
   
}
