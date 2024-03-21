package Trabajos_Practicos.Practico_UML.Ejercicio_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int reservationNumber;
    private List<Vuelo> vuelos;

    //creamos un constructor sobrecargado por si el usuario decide crearlo y despues agregar los vuelos
    public Reserva(int reservationNumber) {
        this.reservationNumber = reservationNumber;
        vuelos = new ArrayList<>();
    }

    public Reserva(int reservationNumber, List<Vuelo> vuelos) {
        this.reservationNumber = reservationNumber;
        this.vuelos = vuelos;
    }

    public void addVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public void removeVuelo(Vuelo vuelo){
        vuelos.remove(vuelo);
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
