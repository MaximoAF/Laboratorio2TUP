package Trabajos_Practicos.Practico_UML.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Avion> aviones;

    //creamos un constructor sobrecargado por si el usuario decide crearlo y despues agregar los aviones
    public Flota (){
        this.aviones = new ArrayList<>();
    }
    public Flota(List<Avion> aviones) {
        this.aviones = aviones;
    }

    //metodos de agregacion
    public void addAvion(Avion avion){
        aviones.add(avion);
    }
    public void removeAvion(Avion avion){
        aviones.remove(avion);
    }

    //getters y setters


    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }
}
