
package dianasantos_lab7;

public class empleados {
    private String seccion;
    private int hourin;
    private int hourout;
    private int sueldo;
    private String estado;

    public empleados() {
    }

    public empleados(String seccion, int hourin, int hourout, int sueldo, String estado) {
        this.seccion = seccion;
        this.hourin = hourin;
        this.hourout = hourout;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getHourin() {
        return hourin;
    }

    public void setHourin(int hourin) {
        this.hourin = hourin;
    }

    public int getHourout() {
        return hourout;
    }

    public void setHourout(int hourout) {
        this.hourout = hourout;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
