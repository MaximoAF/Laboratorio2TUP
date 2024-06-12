package Trabajos_en_clase.clase_10_05.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Equipo<String> equipoFutbol = new Equipo<>("Equipo de Fútbol");
        equipoFutbol.agregarJugador("Messi");
        equipoFutbol.agregarJugador("Neymar");
        equipoFutbol.agregarJugador("Ronaldo");
        equipoFutbol.mostrarJugadores();
        Equipo<Integer> equipoBaloncesto = new Equipo<>("Equipo de Baloncesto");
        equipoBaloncesto.agregarJugador(23);
        equipoBaloncesto.agregarJugador(11);
        equipoBaloncesto.agregarJugador(7);
        equipoBaloncesto.mostrarJugadores();

    }
}
