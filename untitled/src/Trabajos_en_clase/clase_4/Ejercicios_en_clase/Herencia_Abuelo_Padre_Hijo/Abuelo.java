package Trabajos_en_clase.clase_4.Ejercicios_en_clase.Herencia_Abuelo_Padre_Hijo;

public class Abuelo {
    private String apellido;

    public Abuelo(String apellido) {
        this.apellido = apellido;
        System.out.println("Se creo un Abuelo");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
