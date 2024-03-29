package Trabajos_en_clase.clase_4.Ejercicios_en_clase.Relacion_Personas;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;
    private ArrayList<Persona> hijos= new ArrayList<>();
    private Persona [] padres = new Persona[2];

    public Persona() {
    }

    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Persona> hijos) {
        this.hijos = hijos;
    }

    public Persona[] getPadres() {
        return padres;
    }

    public void setPadres(Persona[] padres) {
        this.padres = padres;
    }

    public void agregarHijos(Persona hijo){
        this.hijos.add(hijo);
    }

    public void agregarPadre(Persona padre){

        for (int i = 0; i < padres.length ; i++) {
            if (padres[i] == null) {
                this.padres[i] = padre;
                break;
            }
        }
    }

    public int caminar(String lugar, int km){
        int pasos;
        pasos = km*3000;
        System.out.println("Estuve caminando por "+lugar);
        return pasos;
    }
}