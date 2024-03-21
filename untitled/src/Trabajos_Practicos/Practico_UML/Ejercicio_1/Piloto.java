package Trabajos_Practicos.Practico_UML.Ejercicio_1;
public class Piloto extends Persona implements Volador{
    private String credential;

    public Piloto(String name, int age, String credential) {
        super(name, age);
        this.credential = credential;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    @Override
    public String volar() {
        return "El pilotot esta volando";
    }
}
