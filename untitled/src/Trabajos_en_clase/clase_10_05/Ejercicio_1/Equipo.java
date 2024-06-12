package Trabajos_en_clase.clase_10_05.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Equipo <T>{
    private String nombre;
    private List<T> jugadores;
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void agregarJugador(T jugador) {
        jugadores.add(jugador);
    }
    public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ":");
        for (T jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
