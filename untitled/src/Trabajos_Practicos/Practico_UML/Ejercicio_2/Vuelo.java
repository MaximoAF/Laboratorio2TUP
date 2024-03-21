package Trabajos_Practicos.Practico_UML.Ejercicio_2;

public class Vuelo {
    private int flightNumber;
    private Avion avion;

    public Vuelo(int flightNumber, Avion avion) {
        this.flightNumber = flightNumber;
        this.avion = avion;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

}
