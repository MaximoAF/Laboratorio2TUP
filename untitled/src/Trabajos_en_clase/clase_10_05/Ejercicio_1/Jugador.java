package Trabajos_en_clase.clase_10_05.Ejercicio_1;

public class Jugador {
    private String nombre;
    private String apellido;
    private int posicion;

    public Jugador(String nombre, String apellido, int posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
