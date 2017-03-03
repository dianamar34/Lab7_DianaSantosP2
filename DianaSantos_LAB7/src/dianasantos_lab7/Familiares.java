
package dianasantos_lab7;

import java.awt.Color;
import java.util.ArrayList;


public class Familiares {
    private String ID;
    private int edad;
    private String nacionalidad;
    private String nombre;
    private Color colorpiel;
    private String padre;
    ArrayList familiar = new ArrayList();

    public Familiares() {
    }

    public Familiares(String ID, int edad, String nacionalidad, String nombre, Color colorpiel, String padre) {
        this.ID = ID;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.colorpiel = colorpiel;
        this.padre = padre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColorpiel() {
        return colorpiel;
    }

    public void setColorpiel(Color colorpiel) {
        this.colorpiel = colorpiel;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public ArrayList getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList familiar) {
        this.familiar = familiar;
    }
    
    
}
