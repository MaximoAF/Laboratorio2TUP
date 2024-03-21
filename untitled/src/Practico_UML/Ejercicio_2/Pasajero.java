package Practico_UML.Ejercicio_2;

public class Pasajero extends Persona{
    private int idPasajero;

    public Pasajero(String name, int age, int idPasajero) {
        super(name, age);
        this.idPasajero = idPasajero;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }
}
