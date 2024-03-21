package Practico_UML.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private int reservationNumber;
    private Pasajero pasajero;
    private List<Vuelo> vuelos;


    //creamos un constructor sobrecargado por si el usuario decide crearlo y despues agregar los vuelos
    public Reserva(int reservationNumber,Pasajero pasajero) {
        this.reservationNumber = reservationNumber;
        this.pasajero = pasajero;
        vuelos = new ArrayList<>();
    }

    public Reserva(int reservationNumber,Pasajero pasajero, List<Vuelo> vuelos) {
        this.reservationNumber = reservationNumber;
        this.pasajero = pasajero;
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

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
