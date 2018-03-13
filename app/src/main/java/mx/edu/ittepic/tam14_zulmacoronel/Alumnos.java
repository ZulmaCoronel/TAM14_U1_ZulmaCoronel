package mx.edu.ittepic.tam14_zulmacoronel;

/**
 * Created by Zulma on 12/03/2018.
 */

public class Alumnos {
    int id;             int color;
    String nombre;     String numeroControl;       String foto;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {this.numeroControl = numeroControl;}

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Alumnos(int id, String nombre, String numeroControl, String foto, int color) {
        this.id = id;
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.foto = foto;
        this.color = color;
    }
}

